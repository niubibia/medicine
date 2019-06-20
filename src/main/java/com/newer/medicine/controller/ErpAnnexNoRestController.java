package com.newer.medicine.controller;

import com.newer.medicine.domain.ErpAnnex;
import com.newer.medicine.sercurity.domain.JwtTokenUtil;
import com.newer.medicine.sercurity.domain.JwtUser;
import com.newer.medicine.service.ErpAnnexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("api")
public class ErpAnnexNoRestController {
    @Value("${jwt.header}")
    private String tokenHeader;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private ErpAnnexService erpAnnexService;

    //修改新增数据
    @RequestMapping("updinsAllAnnexxxx")
    @ResponseBody
    public int updinsAllAnnexxxx(@RequestBody ErpAnnex erpAnnex,
                                                     HttpServletRequest request){
        int count=0;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        if(erpAnnex.getAnnexId()!=null && erpAnnex.getAnnexId()!=""){
            count+=erpAnnexService.updateAllAnnexxxx(erpAnnex);
        }else{
            erpAnnex.setAnnexNumber(Long.toString(System.currentTimeMillis()));
            erpAnnex.setAnnexId(Long.toString(System.currentTimeMillis()));
            erpAnnex.setAnnexTime(sdf.format(new Date()));
            erpAnnex.setCreatetime(sdf.format(new Date()));
            String token = request.getHeader(tokenHeader).substring(7);
            String username = jwtTokenUtil.getUsernameFromToken(token);
            JwtUser user = (JwtUser) userDetailsService.loadUserByUsername(username);
            erpAnnex.setCreater(user.getUsername());
            count+=erpAnnexService.insertAllAnnexxxx(erpAnnex);
        }
        return count;
    }
}
