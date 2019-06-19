package com.newer.medicine.server;

import com.newer.medicine.domain.Erp_purchase_details;
import com.newer.medicine.mapper.Erp_purchase_detailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Erp_purchase_detailsService {
    @Autowired
    private Erp_purchase_detailsMapper erp_purchase_detailsMapper;
    public int  insertErp_purchase_details(String PUR_DET_ID,int PUR_TOTAL_NUMBER,double PUR_TOTAL_PRICE){
        return erp_purchase_detailsMapper.insertErp_purchase_details(PUR_DET_ID,PUR_TOTAL_NUMBER,PUR_TOTAL_NUMBER);
    }
}
