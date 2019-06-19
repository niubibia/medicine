package com.newer.medicine.controller;

import com.newer.medicine.domain.Erp_audit;
import com.newer.medicine.domain.Erp_purchase;
import com.newer.medicine.domain.Erp_purchase_details;
import com.newer.medicine.server.Erp_purchaseServer;
import com.newer.medicine.server.Erp_purchase_detailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api")
public class Erp_purchaseController {
    @Autowired
    private Erp_purchaseServer erp_purchaseServer;
    @Autowired
    private Erp_purchase_detailsService erp_purchase_detailsService;

    //@PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(value = "selectErpApplyasset",method = RequestMethod.GET)
    public Map<String,Object> selectErp_applyasset(@RequestParam(value = "PURC_TITLE",required = false)String PURC_TITLE,
                                                   @RequestParam(value = "PURC_NAME",required = false)String PURC_NAME,
                                                   @RequestParam(value = "page",required = false)int pageIndex,
                                                   @RequestParam(value = "limit",required = false)int pageSize){
        List<Erp_purchase> erp_applyassetList=erp_purchaseServer.selectErp_applyasset(PURC_TITLE,PURC_NAME,pageIndex,pageSize);

        Map<String,Object> data=new HashMap<>();
        data.put("code",0);
        data.put("msg","");
        data.put("count",erp_purchaseServer.selectErp_applyassetCount());
        data.put("data",erp_applyassetList);
        return data;
    }
    //查询详情
    @RequestMapping(value = "selectById",method =RequestMethod.GET )
    public ResponseEntity<?> selectById(@RequestParam(value = "PURC_ID",required =false )String PURC_ID){
        List<Erp_purchase> erp_purchase=erp_purchaseServer.selectById(PURC_ID);
return new ResponseEntity<>(erp_purchase,HttpStatus.OK);
    }

    //新增
    @RequestMapping(value = "insertAll",method = RequestMethod.POST)
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = Exception.class)
public ResponseEntity<?> insertAll(@RequestParam(value = "PURC_ID",required = false)String PURC_ID,
                                   @RequestParam(value = "PURC_TITLE",required = false)String PURC_TITLE,
                                   @RequestParam(value = "PURC_NAME",required = false)String PURC_NAME,
                                   @RequestParam(value = "PURC_TOTAL_PRICE",required = false)String PURC_TOTAL_PRICE){
    Erp_purchase erp_purchase=new Erp_purchase();
        String PUR_DET_ID=PURC_ID;
        int PUR_TOTAL_NUMBER=Integer.parseInt(PURC_TOTAL_PRICE);
        double PUR_TOTAL_PRICE=Double.parseDouble(PURC_TOTAL_PRICE);
    int line=erp_purchase_detailsService.insertErp_purchase_details(PUR_DET_ID,PUR_TOTAL_NUMBER,PUR_TOTAL_PRICE);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String PURC_TIME=simpleDateFormat.format(new Date());
        String CREATETIME=simpleDateFormat.format(new Date());
    int i=erp_purchaseServer.insertErp_purchase(PURC_ID,PURC_TITLE,PURC_NAME,PURC_TIME,CREATETIME,Integer.parseInt(PURC_TOTAL_PRICE));
    return new ResponseEntity<>(line+i,HttpStatus.OK);
}


////审核表中查看详情
    @RequestMapping(value = "selectByAuditId",method = RequestMethod.GET)
    public ResponseEntity<?> selectByAuditId(@RequestParam(value = "PURC_ID",required = false)String PURC_ID){
List<Erp_purchase> erp_purchaseList=erp_purchaseServer.selectByAuditId(PURC_ID);
return new ResponseEntity<>(erp_purchaseList,HttpStatus.OK);
    }


    //审核
    @RequestMapping(value = "updateByPURCid",method = RequestMethod.PUT)
    public ResponseEntity<?> updateByPURCid(@RequestParam("STATE")int STATE,
                                            @RequestParam("PURC_ID")String PURC_ID){
        int line=erp_purchaseServer.updateByPURCid(STATE,PURC_ID);
        return new ResponseEntity<>(line,HttpStatus.OK);
    }

    //删除
    @RequestMapping(value = "delectErp_purchase/{PURC_ID}",method = RequestMethod.DELETE)
    public ResponseEntity<?> delectErp_purchase(@PathVariable("PURC_ID")String PURC_ID){
        int line=erp_purchaseServer.delectErp_purchase(PURC_ID);
        return new ResponseEntity<>(line,HttpStatus.OK);
    }
    //修改
    @RequestMapping(value = "updataByErp_purchase",method = RequestMethod.PUT)
    public ResponseEntity<?> updataByErp_purchase(@RequestParam("PURC_ID")String PURC_ID,
                                                  @RequestParam("PURC_TITLE")String PURC_TITLE,
                                                  @RequestParam("PURC_NAME")String PURC_NAME,
                                                  @RequestParam("STATE")int  STATE,
                                                  @RequestParam("PURC_TOTAL_PRICE")String  PURC_TOTAL_PRICE){
        int line=erp_purchaseServer.updataByErp_purchase(PURC_ID,PURC_TITLE,PURC_NAME,STATE,Double.parseDouble(PURC_TOTAL_PRICE));
        return new ResponseEntity<>(line,HttpStatus.OK);
    }
}
