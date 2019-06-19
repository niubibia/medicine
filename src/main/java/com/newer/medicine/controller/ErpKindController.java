package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpKinds;
import com.newer.medicine.service.ErpKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ErpKindController {

    @Autowired
    private ErpKindService erpKindService;

    @RequestMapping(value = "selectAllErpKindsss",method = RequestMethod.GET)
    public Map<String,Object> selectAllErpKindsss(@RequestParam("indentId")String indentId){
        Map<String,Object> data=new HashMap<>();
        List<ErpKinds> erpKinds=erpKindService.selectAllErpKindsss(indentId);
        data.put("count",erpKinds.size());
        data.put("data",erpKinds);
        return data;
    }

    //审核
    @RequestMapping(value = "updateCheckState",method = RequestMethod.PUT)
    public ResponseEntity<Integer> updateCheckState(String indentId){
        return new ResponseEntity<>(erpKindService.updateCheckState(indentId),HttpStatus.OK);
    }
}
