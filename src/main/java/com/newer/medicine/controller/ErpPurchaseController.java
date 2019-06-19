package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpPurchase;
import com.newer.medicine.server.ErpPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class ErpPurchaseController {
    @Autowired
    private ErpPurchaseService erpPurchaseService;

    /**
     * 采购查询
     */
    @RequestMapping("/findPruchase")
    public ResponseEntity<?> findPruchase(){
        List<ErpPurchase> erpPurchases = erpPurchaseService.findpurchase();
        return new ResponseEntity<>(erpPurchases,HttpStatus.OK);
    }
}
