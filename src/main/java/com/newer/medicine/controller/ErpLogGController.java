package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpLog;
import com.newer.medicine.service.ErpLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ErpLogGController {
    @Autowired
    private ErpLogService erpLogService;

    @RequestMapping(value = "selectAllErpLogDetaill",method = RequestMethod.GET)
    public ResponseEntity<List<ErpLog>> selectAllErpLogDetaill(@RequestParam("indentId") String indentId){
       List<ErpLog> erpLogs=erpLogService.selectAllErpLogDetaill(indentId);
       return new ResponseEntity<>(erpLogs,HttpStatus.OK);
    }
}
