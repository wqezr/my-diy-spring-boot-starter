package com.wqezr.config;

import com.wqezr.service.TokenService;
import com.wqezr.utils.TokenProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2021/1/23.
 */

@Configuration
@EnableConfigurationProperties({TokenProperties.class})
public class TokenAutoConfiguration {

    @Bean
    public TokenService getTokenService(){
        return new TokenService();
    }

}
