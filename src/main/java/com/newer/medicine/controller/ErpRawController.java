package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpDrugResult;
import com.newer.medicine.domain.ErpRaw;
import com.newer.medicine.domain.ErpResuit;
import com.newer.medicine.exception.MyException;
import com.newer.medicine.service.ErpRawService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program:${PROJECT.NAME}
 * @description:
 * @author:Mr.u create:2019-06-21 09::
 **/
@RestController
@RequestMapping("/api")
public class ErpRawController {

    @Autowired
    private ErpRawService erpRawService;

    @RequestMapping(value = "findAllRaw",method = RequestMethod.GET)
    public Map<String,Object> findAllRaw(@RequestParam("limit")int limit,
                                         @RequestParam("page")int page,
                                         @RequestParam(value = "pricer",required = false)String keyWords){
        if(keyWords==null){
            keyWords="";
        }
        List<ErpRaw> erpRawList = erpRawService.selectAllRaw(keyWords,(page-1)*limit,limit);
        int count = erpRawService.selectRawCount(keyWords);
        Map<String,Object> map = new HashMap<>();
        map.put("code", "");
        map.put("msg", "");
        map.put("count", erpRawList.size());
        map.put("data", erpRawList);
        return map;
    }

    /**
     * 根据原材料id查询
     * @param rawId
     * @return
     */
    @RequestMapping(value = "selectByRawId",method = RequestMethod.GET)
    public ResponseEntity<?> selectByRawId(@RequestParam("rawId")String rawId){
        return new ResponseEntity<>(erpRawService.selectByRawId(rawId),HttpStatus.OK);
    }

    @RequestMapping(value = "updRaw" ,method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<?> updRaw(@RequestParam(value = "rawId",required = false)String rawId, @RequestParam("rawName")String rawName,
                                    @RequestParam("applyId")String applyId, @RequestParam("creater")String creater,
                                    @RequestParam("resId")String resId, @RequestParam("rawPrice")BigDecimal rawPrice,
                                    @RequestParam("rawContent")BigDecimal rawContent,@RequestParam("rawUnit")String rawUnit) throws MyException {
        ErpRaw erpRaw = new ErpRaw();
        erpRaw.setRawId(rawId);
        erpRaw.setApplyId(applyId);
        erpRaw.setCreater(creater);
        erpRaw.setRawPrice(rawPrice);
        erpRaw.setRawContent(rawContent);
        erpRaw.setRawUnit(rawUnit);
        System.out.println(erpRaw.toString());
        String ri[] = resId.split(",");
        List<ErpDrugResult> erpDrugResults = new ArrayList<>();
        for(String r:ri){
            ErpDrugResult erpDrugResult = new ErpDrugResult();
            erpDrugResult.setResId(r);
            erpDrugResults.add(erpDrugResult);
        }
        System.out.println("resId:"+resId);

//        System.out.println("rawID:"+erpRaw.getRawId());
        return new ResponseEntity<>(erpRawService.updRaw(erpRaw,erpDrugResults),HttpStatus.OK);
    }
    @RequestMapping(value = "insertRaw",method = RequestMethod.POST)
    public ResponseEntity<?> insertRaw(@RequestParam("rawName")String rawName,
                                       @RequestParam("applyId")String applyId, @RequestParam("creater")String creater,
                                       @RequestParam("resId")String resId, @RequestParam("rawPrice")BigDecimal rawPrice,
                                       @RequestParam("rawContent")BigDecimal rawContent,@RequestParam("rawUnit")String rawUnit) throws MyException {
//        System.out.println("rawID:"+erpRaw.getRawId());
        ErpRaw erpRaw = new ErpRaw();
        erpRaw.setApplyId(applyId);
        erpRaw.setRawName(rawName);
        erpRaw.setRawUnit(rawUnit);
        erpRaw.setRawContent(rawContent);
        erpRaw.setRawPrice(rawPrice);
        erpRaw.setCreater(creater);
        String[] rs = resId.split(",");
        List<ErpDrugResult> erpDrugResultList = new ArrayList<>();
        for(String r: rs){
            ErpDrugResult erpDrugResult = new ErpDrugResult();
            erpDrugResult.setResId(r);
            erpDrugResultList.add(erpDrugResult);
        }
        return new ResponseEntity<>(erpRawService.insertRaw(erpRaw,erpDrugResultList),HttpStatus.OK);
    }
    @RequestMapping(value = "updRawIsva" ,method = RequestMethod.PUT)
    public ResponseEntity<?> updRawIsva(@RequestParam("rawId")String rawId){
//        System.out.println("rawID:"+erpRaw.getRawId());
        return new ResponseEntity<>(erpRawService.updRawIsva(rawId),HttpStatus.OK);
    }
}
