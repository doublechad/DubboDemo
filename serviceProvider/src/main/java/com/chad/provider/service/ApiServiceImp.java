package com.chad.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.chad.api.ApiService;
import org.springframework.stereotype.Component;

@Service(interfaceClass = ApiService.class)
@Component
public class ApiServiceImp implements ApiService {

    public String some() {
        return "it's work";
    }
}
