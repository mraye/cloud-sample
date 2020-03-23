package com.github.vspro.cloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${config.name}")
    private String name;

    @RequestMapping("/index")
    public String index(){
        return "hello config "+ name;
    }
}
