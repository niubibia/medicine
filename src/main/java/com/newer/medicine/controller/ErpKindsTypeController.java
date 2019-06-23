package com.newer.medicine.controller;

import com.newer.medicine.service.ErpKindsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:${PROJECT.NAME}
 * @description:
 * @author:Mr.u create:2019-06-21 14::
 **/
@RestController
@RequestMapping("/api")
public class ErpKindsTypeController {

    @Autowired
    private ErpKindsTypeService erpKindsTypeService;
    @GetMapping("findAllKindsType")
    public ResponseEntity<?> findAllKindsType(){
        return new ResponseEntity<>(erpKindsTypeService.findAllKindsType(),HttpStatus.OK);
    }
}
