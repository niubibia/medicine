package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpKindsType;
import com.newer.medicine.sercurity.domain.JwtTokenUtil;
import com.newer.medicine.sercurity.domain.JwtUser;
import com.newer.medicine.service.ErpKindsTypeService;
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
@RequestMapping("api")
public class ErpKindsTypeController {
    @Value("${jwt.header}")
    private String tokenHeader;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private ErpKindsTypeService erpKindsTypeService;

    @RequestMapping(value = "selectAllKindTypeee",method = RequestMethod.GET)
    public Map<String,Object> selectAllKindTypeee(@RequestParam("key")String key,
                                   @RequestParam("page")int page,
                                   @RequestParam("limit")int limit){
        Map<String,Object> data=new HashMap<>();
        List<ErpKindsType> erpKindsTypes=erpKindsTypeService.selectAllKindTypeee(key,page,limit);
        int count=erpKindsTypeService.selectAllKindTypeeeCount(key);
        data.put("msg","");
        data.put("code",0);
        data.put("data",erpKindsTypes);
        data.put("count",count);
        return data;
    }

    @RequestMapping("updinsKindsTypee")
    public ResponseEntity<Integer> updinsKindsTypee(@RequestBody ErpKindsType erpKindsType,HttpServletRequest request){
        int count=0;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        if(erpKindsType.getTypeId()!=null &&erpKindsType.getTypeId()!=""){
            count+=erpKindsTypeService.updateAllKindTypeee(erpKindsType);
        }else{
            String token = request.getHeader(tokenHeader).substring(7);
            String username = jwtTokenUtil.getUsernameFromToken(token);
            JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
            erpKindsType.setCreater(user.getUsername());
            erpKindsType.setTypeId(Long.toString(System.currentTimeMillis()));
            erpKindsType.setTypeSerial(Long.toString(System.currentTimeMillis()));
            erpKindsType.setCreatetime(sdf.format(new Date()));
            count+=erpKindsTypeService.insertAllKindTypeee(erpKindsType);
        }
        return new ResponseEntity<>(count,HttpStatus.OK);
    }

    @RequestMapping(value = "deleteAllKindTypeee",method = RequestMethod.DELETE)
    public ResponseEntity<Integer> deleteAllKindTypeee(@RequestParam("typeId")String typeId){
        int count=erpKindsTypeService.deleteAllKindTypeee(typeId);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }
}
