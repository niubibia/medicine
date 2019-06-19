package com.newer.medicine.service;

import com.newer.medicine.domain.*;
import com.newer.medicine.exception.MyException;
import com.newer.medicine.mapper.ErpBankMapper;
import com.newer.medicine.mapper.ErpQualityDetailMapper;
import com.newer.medicine.mapper.ErpQualityMapper;
import com.newer.medicine.server.Erp_purchaseServer;
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
 * @description: 质检
 * @author:Mr.u create:2019-06-14 13::
 **/
@Service
public class ErpQualityService {
    @Autowired
    private ErpQualityMapper erpQualityMapper;
    @Autowired
    private ErpBankMapper erpBankMapper;
    @Autowired
    private ErpQualityDetailMapper erpQualityDetailMapper;
    @Autowired
    private Erp_purchaseServer erp_purchaseServer;
    @Autowired
    private ErpProindentService erpProindentService;

    /**
     * 查询质检信息
     *
     * @param quaIsva
     * @param pageIndex
     * @param limit
     * @return
     */
    public List<ErpQuality> selectQuality(int quaIsva, String keyWords, int pageIndex, int limit) {
        return erpQualityMapper.selectQuality(quaIsva, keyWords, pageIndex, limit);
    }

    /**
     * 查询质检总纪录数
     *
     * @param quaIsva
     * @return
     */
    public int selectCounts(String keyWords, int quaIsva) {
        return erpQualityMapper.selectCounts(keyWords, quaIsva);
    }

    /**
     * 查询质检详细信息
     *
     * @param quaId
     * @return
     */
    public ErpQuality selectQualityDetail(String quaId) {
        return erpQualityMapper.selectQualityDetail(quaId);
    }

    // 更改质检状态
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int updquaIsva(String quaId, Integer bankCount, String remark) {
        ErpQuality erpQuality = new ErpQuality();
        erpQuality.setQuaId(quaId);//获取质检id
        erpQuality.setQuaIsva(4);//质检状态
        erpQuality.setRemark(remark);
        int i = erpQualityMapper.updquaIsva(erpQuality);//修改质检状态
        if (i < 1) {
            try {
                throw new MyException("质检状态修改失败");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
        ErpBank erpBank = new ErpBank();//入库对象
        ErpQuality Qualitybank = erpQualityMapper.selectQualityDetail(quaId);
        String bankId = UUID.randomUUID() + "";
        erpBank.setBankId(bankId);
        String data = erpBankMapper.selectSerial(Tools.getDateStr(new Date()));//通过得到当前最大编号的方法同时使用工具类把该编号格式成日期
        erpBank.setBankNumber(Tools.getSerial(data, "RK"));//使用工具类得到入库编号
//        erpBank.setBankTime("");
        erpBank.setBankCount(bankCount);
//        erpBank.setBankStaffid("");
        erpBank.setIsva(1);
        erpBank.setCreatetime(Tools.getCurDateTime());
        erpBank.setCreater(Qualitybank.getCreater());
        erpBank.setReaark(remark);//
        erpBank.setBankIsva(1);
        int j = erpBankMapper.insertSelective(erpBank);//插入入库单表
        if (j < 1) {
            try {
                throw new MyException("入库单填写失败");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
        return i + j;
    }

    /**
     * 更新质检状态 并插入质检详细信息
     * @param erpQuality
     * @param erpQualityDetails
     * @return
     */
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int updIsvaAndInsertqudt(ErpQuality erpQuality, List<ErpQualityDetail> erpQualityDetails) {
//        erpQuality.setQuaIsva(2);
        int i = 0;
        int j = 0;
        if (erpQuality.getQuaIsva() == 3 ) {//表示质检打回状态为3
            i = erpQualityMapper.updateByPrimaryKeySelective(erpQuality);
            if(i<1){
                try {
                    throw new MyException("更改失败");
                } catch (MyException e) {
                    e.printStackTrace();
                }
            }
            if(erpQuality.getPurcId().length()!=0){//质检打回修改采购状态
                Erp_purchase erpPurchase = new Erp_purchase();
                erpPurchase.setSTATE(5);
                erpPurchase.setPURC_ID(erpQuality.getPurcId());
                j = erp_purchaseServer.updPurchase(erpPurchase);
            }
            if(erpQuality.getIndentId().length()!=0){//质检打回修改生产状态
                ErpProindent erpProindent = new ErpProindent();
                erpProindent.setIndentId(erpQuality.getIndentId());
                erpProindent.setState(5);
                erpProindent.setRemark(erpQuality.getRemark());
                j = erpProindentService.updIndent(erpProindent);
            }
        } else if(erpQuality.getQuaIsva()==2){ //表示质检通过状态为2
            i = erpQualityMapper.updateByPrimaryKeySelective(erpQuality);
            if (i < 1) {
                try {
                    throw new MyException("更改失败");
                } catch (MyException e) {
                    e.printStackTrace();
                }
            }

        }
        for (ErpQualityDetail e : erpQualityDetails) {
            j = erpQualityDetailMapper.insertSelective(e);//插入质检详细表
            if (j < 1) {
                try {
                    throw new MyException("插入质检详细表失败");
                } catch (MyException e1) {
                    e1.printStackTrace();
                }
            }
        }
        System.out.println(i+j);
        return i + j;
    }
}
