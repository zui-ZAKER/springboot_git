package com.entor.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    public String index(){
        return  "Welcome to index";
    }

}
