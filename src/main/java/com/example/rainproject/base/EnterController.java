package com.example.rainproject.base;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnterController {


    @RequestMapping("/hello")
    public String sayHello() {
        return "hello world";
    }
}
