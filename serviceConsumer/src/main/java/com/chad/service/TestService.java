package com.chad.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.chad.api.ApiService;
import org.springframework.stereotype.Component;

@Component
public class TestService implements ApiService {

    @Reference(timeout = 5000, check= false)
    public ApiService service;

    public String some() {
        return service.some();
    }
}
