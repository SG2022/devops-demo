package com.example.devops_demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Devops-Demo application is running";
    }
    

}
