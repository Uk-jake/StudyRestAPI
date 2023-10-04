package com.springboot.makingRestAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/test")
    public String hello(){
        return "Helllo World";
    }

}
