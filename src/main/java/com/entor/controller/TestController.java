package com.entor.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/hello")
    public  String  hello(){
        return "hello";
    }

    @GetMapping("/getPort")
    public String getPort(){
        return "server.port="+port;
    }
}
