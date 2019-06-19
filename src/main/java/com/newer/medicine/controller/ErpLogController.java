package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpLog;
import com.newer.medicine.server.ErpLogServer;
import com.newer.medicine.util.Pages;
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
public class ErpLogController {
    @Autowired
    private ErpLogServer erpLogServer;
    @RequestMapping(value = "showList",method = RequestMethod.GET)
    public Map<String,Object> showList(@RequestParam(value = "key",required = false)String key,
                                       @RequestParam("page")int page,
                                       @RequestParam("limit")int limit){
        Map<String,Object> map = new HashMap<String, Object>();
        if (key==null){
            key="";
        }
        List<ErpLog> list=erpLogServer.selectshow(key,(page-1)*limit,limit);//查询所有
        System.out.println("list++++++++"+list);
        int totalCount=erpLogServer.select(key);
        //layui数据表格需要返回的参数
        map.put("count",totalCount);//总行数
        map.put("data", list);
        map.put("code",0);
        map.put("msg", "");
        System.out.println("map++++++"+map);
        return map;

    }

    }

