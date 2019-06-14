package com.newer.medicine.sercurity.service;


import com.newer.medicine.domain.Admins;
import com.newer.medicine.domain.ErpStaff;
import com.newer.medicine.mapper.AdminsMapper;
import com.newer.medicine.mapper.ErpStaffMapper;
import com.newer.medicine.sercurity.domain.JwtUserFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private ErpStaffMapper erpStaffMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        ErpStaff erpStaff = this.erpStaffMapper.findByUsername(username);
        if(erpStaff==null){
            throw  new UsernameNotFoundException("No User found with UserName :"+username);
        }else{
          return JwtUserFactory.create(erpStaff);
        }
    }
}
