package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpLedgyr;
import com.newer.medicine.server.ErpLedgyrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class ErpLedgyrController {
    @Autowired
    private ErpLedgyrService erpLedgyrService;

    //分店财务
    @RequestMapping(value = "selectErpLedger",method = RequestMethod.GET)
public Map<String,Object> selectErpLedger(@RequestParam(value = "SALE_DATE",required = false)String saleDate,
                                          @RequestParam(value = "pageIndex",required = false)Integer pageIndex,
                                          @RequestParam(value = "pageSize",required = false)Integer pageSize){
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
  Date ss = null;
    try {
        if(saleDate!=null&&saleDate!="")
         ss=simpleDateFormat.parse(saleDate);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    List<ErpLedgyr> ledgyrList=erpLedgyrService.selectErpLedger(ss,pageIndex,pageSize);
Map<String,Object> data=new HashMap<>();
data.put("code",0);
    data.put("msg","");
    data.put("count",erpLedgyrService.selectErpLedgerCount());
    data.put("data",ledgyrList);
    return data;
}


//byID查询
    @RequestMapping(value = "selectByGyrId",method = RequestMethod.GET)
    public ResponseEntity<?> selectByGyrId(@RequestParam(value = "GYR_ID",required = false)String gyrId){
        ErpLedgyr erpLedgyr=erpLedgyrService.selectByGyrId(gyrId);
        return new ResponseEntity<>(erpLedgyr,HttpStatus.OK);
    }

    //支出查询
    @RequestMapping(value = "selectFdproform",method = RequestMethod.GET)
    public Map<String,Object> selectFdproform(@RequestParam(value = "FDPRO_TIME",required = false)String fdproTime,
                                              @RequestParam(value = "pageIndex",required = false)Integer pageIndex,
                                              @RequestParam(value = "pageSize",required = false)Integer pageSize){
        List<ErpLedgyr> ledgyrList=erpLedgyrService.selectFdproform(fdproTime,pageIndex,pageSize);
        Map<String,Object> m=new HashMap<>();
        m.put("code",0);
        m.put("msg","");
        m.put("count",erpLedgyrService.selectFdproformCount());
        m.put("data",ledgyrList);
        return m;
    }

    //byFdproformId查询
    @RequestMapping(value = "selectFdproformByGYRID",method = RequestMethod.GET)
    public ResponseEntity<?> selectFdproformByGYRID(@RequestParam(value = "GYR_ID",required = false)String gyrId){
        ErpLedgyr erpLedgyr=erpLedgyrService.selectFdproformByGYRID(gyrId);
        return new ResponseEntity<>(erpLedgyr,HttpStatus.OK);
    }

}




