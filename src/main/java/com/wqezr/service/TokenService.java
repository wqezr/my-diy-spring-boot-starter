package com.wqezr.service;

import com.wqezr.utils.TokenProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2021/1/23.
 */
public class TokenService {

    @Autowired
    private TokenProperties tokenProperties;

    public String getToken(){
        System.out.println("假装生成token");
        return "host:"+tokenProperties.getTokenRedisHost()+",pwd:"+tokenProperties.getTokenRedisPwd();
    }

}
