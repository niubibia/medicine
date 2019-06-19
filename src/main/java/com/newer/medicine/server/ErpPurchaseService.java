package com.newer.medicine.server;

import com.newer.medicine.domain.ErpPurchase;
import com.newer.medicine.mapper.ErpPurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ErpPurchaseService {
    @Autowired
    private ErpPurchaseMapper erp_purchaseMapper;

    /**
     * 采购查询
     * @return
     */
    public List<ErpPurchase> findpurchase(){
        return erp_purchaseMapper.findPurchase();
    }
}
