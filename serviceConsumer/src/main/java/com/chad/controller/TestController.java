package com.chad.controller;

import com.chad.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService service;

    @GetMapping (value = "/dubbo")
    public String getTest( @RequestParam String id){
        System.out.println(id);
        String a =service.some();
        return a==null?"error":String.format("%s,%s",a,id);
    }

}
