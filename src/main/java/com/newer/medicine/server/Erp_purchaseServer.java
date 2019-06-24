package com.newer.medicine.server;


import com.newer.medicine.domain.Erp_audit;
import com.newer.medicine.domain.Erp_purchase;
import com.newer.medicine.domain.Erp_purchase_details;
import com.newer.medicine.mapper.Erp_purchaseMapper;
import com.newer.medicine.mapper.Erp_purchase_detailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class Erp_purchaseServer {
    @Autowired
    private Erp_purchaseMapper erp_purchaseMapper;
    @Autowired
    private Erp_purchase_detailsMapper erp_purchase_detailsMapper;
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

    //新增
    public int insertErp_purchase(String PURC_ID,String PURC_TITLE,String PURC_NAME,String PURC_TIME,String CREATETIME,int PURC_TOTAL_PRICE){
int i=erp_purchaseMapper.insertErp_purchase(PURC_ID,PURC_TITLE,PURC_NAME,PURC_TIME,CREATETIME,PURC_TOTAL_PRICE);
return i;
    }

    //审核表中查看详情
    public List<Erp_purchase> selectByAuditId(String PURC_ID){
        return erp_purchaseMapper.selectByAuditId(PURC_ID);
    }

    public int updateByPURCid(int STATE,String PURC_ID){
        return erp_purchaseMapper.updateByPURCid(STATE,PURC_ID);
    }

    //删除
    public int delectErp_purchase(String PURC_ID){
        return erp_purchaseMapper.delectErp_purchase(PURC_ID);
    }
//修改
    public int updataByErp_purchase(String PURC_ID,String PURC_TITLE,String PURC_NAME,int STATE,double PURC_TOTAL_PRICE){
        return erp_purchaseMapper.updataByErp_purchase(PURC_ID,PURC_TITLE,PURC_NAME,STATE,PURC_TOTAL_PRICE);
    }

}
