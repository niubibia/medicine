package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpProindent;
import com.newer.medicine.service.ErpProindentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ErpProindentController {
    @Autowired
    private ErpProindentService erpProindentService;

    @RequestMapping(value = "selectSSSH",method = RequestMethod.GET)
    public Map<String,Object> listData(@RequestParam(value = "indentNumber",required = false)String indentNumber,
                                       @RequestParam(value = "indentUrgency",required = false)String indentUrgency,
                                       @RequestParam(value = "state",required = false)Integer state,
                                       @RequestParam(value = "indentState",required = false)String indentState,
                                       @RequestParam(value = "page")int page,
                                       @RequestParam(value = "limit")int limit){
        List<ErpProindent> proindents=erpProindentService.selectByParam(indentNumber,indentUrgency,state,indentState,page,limit);
        Integer count=erpProindentService.selectCount(indentNumber,indentUrgency,state,indentState);
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("data",proindents);
        map.put("count",count);
        return map;
    }
}
