package com.newer.medicine.controller;

import com.newer.medicine.domain.Erp_applyasset;
import com.newer.medicine.server.Erp_applyassetServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class Erp_applyassetController {
    @Autowired
    private Erp_applyassetServer erp_applyassetServer;

    @RequestMapping(value = "selectErp_applyasset",method = RequestMethod.GET)
    public ResponseEntity<?> selectErp_applyasset(){
        List<Erp_applyasset> erp_applyassetList=erp_applyassetServer.selectErp_applyasset();
        return new ResponseEntity<>(erp_applyassetList,HttpStatus.OK);
    }
}
