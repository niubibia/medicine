package com.newer.medicine.controller;

import com.newer.medicine.service.ErpProindentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program:${PROJECT.NAME}
 * @description:生产
 * @author:Mr.u create:2019-06-16 18:new Date():new Date()
 **/
@RestController
@RequestMapping("/api")
public class ErpProindentController {

    @Autowired
    private ErpProindentService erpProindentService;

    /**
     * 根据生产id查询详细信息
     * @param indentId
     * @return
     */
    @RequestMapping(value = "selectByIndentId" ,method = RequestMethod.GET)
    public ResponseEntity<?> selectByIndentId(@RequestParam("indentId")String indentId){
        return new ResponseEntity<>(erpProindentService.selectByIndentId(indentId),HttpStatus.OK);
    }
}
