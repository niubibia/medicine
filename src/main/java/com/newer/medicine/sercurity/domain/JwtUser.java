package com.newer.medicine.sercurity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

/**
 * 安全服务的用户
 *  需要实现UserDetails接口,用户实体即为Spring Security所使 用的用户
 */
public class JwtUser implements UserDetails {

    private static final long serialVersionUID = 7407700876251417013L;
    //账号
    private final String username;
    private final  Collection<? extends GrantedAuthority> authorities;
    private final String password;
    private final boolean isEnabled;
    private final String name;

    public JwtUser(String username, Collection<? extends GrantedAuthority> authorities, String password, boolean isEnabled, String name) {
        this.username = username;
        this.authorities = authorities;
        this.password = password;
        this.isEnabled = isEnabled;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }



    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }


}
