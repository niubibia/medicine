package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpApply;
import com.newer.medicine.server.Erp_Applyservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class Erp_ApplyController {
    @Autowired
    private Erp_Applyservice erp_applyservice;

    /**
     * 查询供货商
     * @return
     */
    @RequestMapping("/finderpApply")
    public ResponseEntity<?> findErp(){
        List<ErpApply> erpApplies = erp_applyservice.findErp();
        return new ResponseEntity<>(erpApplies,HttpStatus.OK);
    }
}
