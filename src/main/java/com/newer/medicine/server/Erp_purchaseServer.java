package com.newer.medicine.server;


import com.newer.medicine.domain.Erp_purchase;
import com.newer.medicine.mapper.Erp_purchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Erp_purchaseServer {
    @Autowired
    private Erp_purchaseMapper erp_purchaseMapper;
    public  List<Erp_purchase> selectErp_applyasset(String PURC_TITLE,String PURC_NAME,int pageIndex,int pageSize){
        List<Erp_purchase> erp_applyassetList=erp_purchaseMapper.selectErpApplyasset(PURC_TITLE,PURC_NAME,pageIndex,pageSize);
        return erp_applyassetList;
    }

    public int selectErp_applyassetCount(){

        return erp_purchaseMapper.selectErp_applyassetCount();
    }

    //查询详情
    public List<Erp_purchase> selectById(String PURC_ID){
        return erp_purchaseMapper.selectById1(PURC_ID);
    }

    /**
     * 根据采购id查询详细信息
     * @param purcId 采购id
     * @return
     */
    public Erp_purchase selectByPrimaryKey(String purcId){
        return erp_purchaseMapper.selectByPrimaryKey(purcId);
    }

    /**
     * 修改采购状态
     * @param erpPurchase
     * @return
     */
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public int updPurchase(Erp_purchase erpPurchase){
        return erp_purchaseMapper.updPurchase(erpPurchase);
    }
}
