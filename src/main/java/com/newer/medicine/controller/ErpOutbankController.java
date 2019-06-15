package com.newer.medicine.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.newer.medicine.util.Page;
import com.newer.medicine.domain.ErpOutbank;
import com.newer.medicine.service.ErpOutbankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ErpOutbankController {
    @Autowired
    ErpOutbankService erpOutbankService;

    @GetMapping
    @RequestMapping("/list")
    public Map<String,Object> getAll(Page page,@RequestParam String obNumber){
        Map<String,Object> map=new HashMap<>();
        PageHelper.offsetPage(page.getStart(),page.getLimit());
        List<ErpOutbank> erpOutbanks=null;
        if (!obNumber.equals("对不起谢谢你")){
           erpOutbanks =erpOutbankService.selectByObid(obNumber);
            System.out.println("根据number查询");
        }else {
            erpOutbanks=erpOutbankService.selectAll();
            System.out.println("全部");
        }
        int count= (int) new PageInfo<>(erpOutbanks).getTotal(); /*获取总数*/
        map.put("count",count);
        map.put("data",erpOutbanks);
        map.put("msg","");      //必须有msg
        map.put("code",0);
        return map;
    }

}
