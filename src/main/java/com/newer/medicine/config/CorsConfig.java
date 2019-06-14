package com.newer.medicine.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 跨域配置类
 */
@Configuration //配置类
public class CorsConfig {

    public static String[] orgins = {
            "localhost:8080",
            "127.0.0.1:8080"
    };

    @Bean
    public CorsFilter corsFilter() {

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedMethod("*");//允许访问所有的方法
        corsConfiguration.addAllowedHeader("*");//头部信息所有都可以
        corsConfiguration.setAllowCredentials(true);
        this.addAllowOrgins(corsConfiguration);

        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(source);
    }

    private void addAllowOrgins(CorsConfiguration corsConfiguration) {
        for (String orgin : orgins) {
            corsConfiguration.addAllowedOrigin("http://" + orgin);
            corsConfiguration.addAllowedOrigin("https://" + orgin);
        }
    }

}
