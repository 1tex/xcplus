package com.tyzhao.system.config;/**
 * @description TODO
 * @author tex
 * @date 2023/1/30 10:41
 * @version 1.0
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @projectName: xcplus
 * @package: com.tyzhao.system.config
 * @className: GlobalCrosConfig
 * @author: tex
 * @description: TODO
 * @date: 2023/1/30 10:41
 * @version: 1.0
 */
@Configuration
public class GlobalCrosConfig {
    @Bean
    public CorsFilter getCrosFilter() {
        CorsConfiguration config = new CorsConfiguration();
        //允许白名单域名进行跨域调用
        config.addAllowedOrigin("*");
        //允许跨越发送cookie
        config.setAllowCredentials(true);
        //放行全部原始头信息
        config.addAllowedHeader("*");
        //允许所有请求方法跨域调用
        config.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
