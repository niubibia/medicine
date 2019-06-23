package com.newer.medicine.service;

import com.newer.medicine.domain.ErpDrugResult;
import com.newer.medicine.domain.ErpRaw;
import com.newer.medicine.exception.MyException;
import com.newer.medicine.mapper.ErpRawMapper;
import com.newer.medicine.util.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @program:${PROJECT.NAME}
 * @description:
 * @author:Mr.u create:2019-06-21 11::
 **/

@Service
public class ErpRawService {

    @Autowired
    private ErpRawMapper erpRawMapper;

    @Autowired
    private ErpDrugResultService erpDrugResultService;

    /**
     * 查询所有原材料
     *
     * @return
     */
    public List<ErpRaw> selectAllRaw(String pricer, int limit, int page) {
        return erpRawMapper.selectAllRaw(pricer, limit, page);
    }

    /**
     * 纪录数
     *
     * @param keyWords
     * @return
     */
    public int selectRawCount(String keyWords) {
        return erpRawMapper.selectRawCount(keyWords);
    }

    /**
     * 根据原材料id查询
     *
     * @param rawId
     * @return
     */
    public ErpRaw selectByRawId(String rawId) {
        return erpRawMapper.selectByRawId(rawId);
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int updRaw(ErpRaw erpRaw, List<ErpDrugResult> erpDrugResults) throws MyException {
        int rows = 0;
        List<ErpDrugResult> drlist = erpDrugResultService.findDrugResId(erpRaw.getRawId());//得到该药品的所有药效

        for (ErpDrugResult dgr : drlist) {
            int rws = erpDrugResultService.deleteById(dgr.getDrugResId());
            if (rws < -1) {//药品药效添加失败抛出异常事物回滚
                throw new MyException("修改原材料是发生了报错!");//抛出异常
            }
        }
        for (ErpDrugResult rest : erpDrugResults) {//沥遍页面得到的药效集合添加进药效数据库
            rest.setRawId(erpRaw.getRawId());
            int row = erpDrugResultService.insertSelective(rest);//执行药品药效添加语句
            if (row < -1) {//药品药效添加失败抛出异常事物回滚
                throw new MyException("发生添加药效时了一个报错!");//抛出异常
            }
        }
        rows = erpRawMapper.updRaw(erpRaw);
        return rows;
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int insertRaw(ErpRaw erpRaw, List<ErpDrugResult> erpDrugResultList) throws MyException {
        String data = erpRawMapper.selectSerial(Tools.getDateStr(new Date()));//得到今天创建的最后一条数据
        erpRaw.setRawSerial(Tools.getSerial(data, "YCL"));//用工具类生产编号
        erpRaw.setCreatetime(Tools.getTimeStr(new Date()));//添加创建时间
        String uuid = UUID.randomUUID() + "";
        erpRaw.setRawId(uuid);
        erpRaw.setIsva(1);
        int rows = erpRawMapper.insertRaw(erpRaw);
        if (rows > 0) {
            for (ErpDrugResult erpDrugResult : erpDrugResultList) {
                erpDrugResult.setRawId(uuid);
                int i = erpDrugResultService.insertSelective(erpDrugResult);
                if (i < 0) {
                    throw new MyException("errorr....");
                }
            }
        } else {
            rows = -1;
        }
        return rows;
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int updRawIsva(String rawId) {
        ErpRaw erpRaw = new ErpRaw();
        erpRaw.setIsva(0);
        erpRaw.setRawId(rawId);
        return erpRawMapper.updRaw(erpRaw);
    }
}
