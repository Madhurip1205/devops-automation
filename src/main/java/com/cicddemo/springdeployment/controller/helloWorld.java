package com.cicddemo.springdeployment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

    @GetMapping("/welcome")
    public String getWorld(){
        return "Hello from SpringBoot project! Madhuri";
    }
}
