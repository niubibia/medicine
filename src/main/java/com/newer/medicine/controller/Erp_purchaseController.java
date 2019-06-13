package com.newer.medicine.controller;

import com.newer.medicine.domain.Erp_purchase;
import com.newer.medicine.server.Erp_purchaseServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class Erp_purchaseController {
    @Autowired
    private Erp_purchaseServer erp_purchaseServer;

    @RequestMapping(value = "selectErpApplyasset",method = RequestMethod.GET)
    public Map<String,Object> selectErp_applyasset(){
        List<Erp_purchase> erp_applyassetList=erp_purchaseServer.selectErp_applyasset();
        Map<String,Object> data=new HashMap<>();
        data.put("code",0);
        data.put("msg","");
        data.put("count",erp_purchaseServer.selectErp_applyassetCount());
        data.put("data",erp_applyassetList);
        return data;
    }
}
