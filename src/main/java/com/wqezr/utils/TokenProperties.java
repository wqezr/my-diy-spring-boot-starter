package com.wqezr.utils;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2021/1/23.
 */

@ConfigurationProperties("com.wqezr")
@Data
public class TokenProperties {
    private String tokenRedisHost;
    private String tokenRedisPwd;
}
