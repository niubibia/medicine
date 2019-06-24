package com.newer.medicine.sercurity.domain;


import com.newer.medicine.domain.Admins;
import com.newer.medicine.domain.Authority;
import com.newer.medicine.domain.ErpStaff;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

public final  class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(ErpStaff user){
         return new JwtUser(
                 user.getStaEmail(),

                 mapToGrandAuthroties(user.getAuthorities()),
                 user.getStaPwd(),
                 user.getIsva()==1?true:false,
                user.getStaName(),
                 user.getStaId(),
                 user.getAnnexId(),
                 user.getRoleName()
         );
    }

    private static List<GrantedAuthority> mapToGrandAuthroties(List<Authority> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getName().name()))
                .collect(Collectors.toList());


    }

}
