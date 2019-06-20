package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpAnnex;
import com.newer.medicine.sercurity.domain.JwtTokenUtil;
import com.newer.medicine.sercurity.domain.JwtUser;
import com.newer.medicine.service.ErpAnnexService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ErpAnnexController {

    @Autowired
    private ErpAnnexService erpAnnexService;

    //查询全部分店
    @RequestMapping(value = "selectAllAnnexxxx",method = RequestMethod.GET)
    public Map<String,Object> selectAllAnnexxxx(@RequestParam(value = "key",required = false)String key,
                                 @RequestParam(value = "annexTime",required = false)String annexTime,
                                 @RequestParam("page")int page,
                                 @RequestParam("limit")int limit){
        Map<String,Object> data=new HashMap<>();
        List<ErpAnnex> erpAnnexes=erpAnnexService.selectAllAnnexxxx(key,annexTime,page,limit);
        int count=erpAnnexService.selectAllCountttt(key,annexTime);
        data.put("code",0);
        data.put("msg","");
        data.put("count",count);
        data.put("data",erpAnnexes);
        return data;
    }

    @RequestMapping(value = "deleteAllAnnexxxx",method = RequestMethod.PUT)
    public ResponseEntity<Integer> deleteAllAnnexxxx(@RequestParam("annexId") String annexId){
        System.out.println(annexId);
        return new ResponseEntity<>(erpAnnexService.deleteAllAnnexxxx(annexId),HttpStatus.OK);
    }


}
