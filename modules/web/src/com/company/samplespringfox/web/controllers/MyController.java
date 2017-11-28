package com.company.samplespringfox.web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/myapi")
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}
