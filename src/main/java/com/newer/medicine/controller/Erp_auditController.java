package com.newer.medicine.controller;

import com.newer.medicine.domain.Erp_audit;
import com.newer.medicine.service.Erp_auditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class Erp_auditController {
    @Autowired
    private Erp_auditService erp_auditService;
    @RequestMapping(value = "selectByPURCid",method = RequestMethod.GET)
    public ResponseEntity<?> selectByPURCid(@RequestParam(value = "PURC_ID",required = false)String PURC_ID){
        List<Erp_audit> line=erp_auditService.selectByPURCid(PURC_ID);
        return new ResponseEntity<>(line,HttpStatus.OK);
    }
}
