package com.newer.medicine.service;

import com.newer.medicine.domain.ErpDrugResult;
import com.newer.medicine.domain.ErpResuit;
import com.newer.medicine.exception.MyException;
import com.newer.medicine.mapper.ErpResuitMapper;
import com.newer.medicine.util.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @program:${PROJECT.NAME}
 * @description:
 * @author:Mr.u create:2019-06-21 14::
 **/
@Service
public class ErpResuitService {
    @Autowired
    private ErpResuitMapper erpResuitMapper;
    @Autowired
    private ErpDrugResultService erpDrugResultService;

    public List<ErpResuit> findAllResuit(){
        return erpResuitMapper.findAllResuit();
    }

    public List<ErpResuit> listResuit(String keyWord ,int page,int limit){
        return erpResuitMapper.listResuit(keyWord, page, limit);
    }

    public int listResuitCount(String keyWord){
        return erpResuitMapper.listResuitCount(keyWord);
    }

    public int updResuit(ErpResuit erpResuit){
        return erpResuitMapper.updResuit(erpResuit);
    }
    public int insertResuit(ErpResuit erpResuit){
        String data= erpResuitMapper.selectSerial(Tools.getDateStr(new Date()));
        String uuid = UUID.randomUUID()+"";
        erpResuit.setResId(uuid);
        erpResuit.setIsva(1);
        erpResuit.setCreatetime(Tools.getTimeStr(new Date()));
        erpResuit.setResSerial(Tools.getSerial(data, "YX"));
        return erpResuitMapper.insertResuit(erpResuit);
    }
    public int updResuitIsva(String resId) throws MyException {
        ErpResuit erpResuit = new ErpResuit();
        erpResuit.setResId(resId);
        List<ErpDrugResult> erpDrugResultList = erpDrugResultService.selectByResId(resId);
        for(ErpDrugResult erpDrugResult:erpDrugResultList){
            int row = erpDrugResultService.deleteById(erpDrugResult.getDrugResId());
            if(row<1){
                throw new MyException("删除原材料药效表失败");
            }
        }
        erpResuit.setIsva(0);
        return erpResuitMapper.updResuit(erpResuit);
    }

}
