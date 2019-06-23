package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpResuit;
import com.newer.medicine.exception.MyException;
import com.newer.medicine.service.ErpResuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program:${PROJECT.NAME}
 * @description:
 * @author:Mr.u create:2019-06-21 14::
 **/
@RestController
@RequestMapping("/api")
public class ErpResuitController {
    @Autowired
    private ErpResuitService erpResuitService;

    @RequestMapping(value = "findAllResuit", method = RequestMethod.GET)
    public ResponseEntity<?> findAllResuit() {
        return new ResponseEntity<>(erpResuitService.findAllResuit(), HttpStatus.OK);
    }

    @RequestMapping(value = "listResuit", method = RequestMethod.GET)
    public Map<String, Object> listResuit(@RequestParam(value = "pricer", required = false) String keyWord,
                                          @RequestParam("page") int page, @RequestParam("limit") int limit) {
        Map<String, Object> map = new HashMap<>();
        if (keyWord == null) {
            keyWord = "";
        }
        List<ErpResuit> erpResuitList = erpResuitService.listResuit(keyWord, (page - 1) * limit, limit);
        int count = erpResuitService.listResuitCount(keyWord);
        map.put("code", "");
        map.put("msg", "");
        map.put("count", count);
        map.put("data", erpResuitList);
        return map;
    }

    @RequestMapping(value = "updResuit", method = RequestMethod.PUT)
    public ResponseEntity<?> updResuit(@RequestBody ErpResuit erpResuit) {
        return new ResponseEntity<>(erpResuitService.updResuit(erpResuit), HttpStatus.OK);
    }

    @RequestMapping(value = "insertResuit", method = RequestMethod.POST)
    public ResponseEntity<?> insertResuit(@RequestBody ErpResuit erpResuit) {
        return new ResponseEntity<>(erpResuitService.insertResuit(erpResuit), HttpStatus.OK);
    }

    @RequestMapping(value = "updResuitIsva", method = RequestMethod.PUT)
    public ResponseEntity<?> updResuitIsva(@RequestParam("resId")String resId) throws MyException {
        return new ResponseEntity<>(erpResuitService.updResuitIsva(resId),HttpStatus.OK);
    }
}
