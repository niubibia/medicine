package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpPactType;
import com.newer.medicine.server.ErpPactTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class ErpPactTypeController {
    @Autowired
    private ErpPactTypeService erpPactTypeService;

    @RequestMapping("/findPactType")
    public ResponseEntity<?> findPactType(){
        List<ErpPactType> erpPactTypes = erpPactTypeService.findPactType();
        return new ResponseEntity<>(erpPactTypes,HttpStatus.OK);
    }
}
