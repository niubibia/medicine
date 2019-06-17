package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpProindent;
import com.newer.medicine.domain.ErpProindentDetail;
import com.newer.medicine.service.ErpProindentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    //删除生产订单
    @RequestMapping(value = "delPROINDENT",method = RequestMethod.PUT)
    public ResponseEntity<Integer> delPROINDENT(@RequestParam("indentId")String indentId){
        int count=erpProindentService.delPROINDENT(indentId);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }

    //按主键查找生产订单详情
    @RequestMapping(value = "selectProindentsById",method = RequestMethod.GET)
    public ResponseEntity<List<ErpProindentDetail>> selectById(@RequestParam("indentId")String indentId){
        return new ResponseEntity<>(erpProindentService.selectById(indentId),HttpStatus.OK);
    }

    //修改生产订单的数量
    @RequestMapping(value = "updateProindentsByIddd",method = RequestMethod.PUT)
    public ResponseEntity<Integer>  updateProindentsByIddd(@RequestBody List<ErpProindentDetail> data,
                                                           @RequestParam("indentId")String indentId
                                                           ){
        System.out.println(indentId);
        int count=0;
        int INDENT_COUNT=0;
        double INDENT_MONEY=0;
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i).getEntdeId());
            erpProindentService.updateProindentsByIddd(data.get(i).getEntdeNum(),data.get(i).getEntdePrice(),data.get(i).getEntdeId());
            INDENT_COUNT+=data.get(i).getEntdeNum();
            INDENT_MONEY+=data.get(i).getEntdePrice();
            count++;
        }
        erpProindentService.updateProindentsPriceeee(INDENT_COUNT,INDENT_MONEY,indentId);
        return new ResponseEntity<>(count,HttpStatus.OK);
        /*int count=erpProindentService.updateProindentsByIddd(entdeNum,entdePrice,indentId);
        return new ResponseEntity<>(entdeNum,HttpStatus.OK);*/
    }
}
