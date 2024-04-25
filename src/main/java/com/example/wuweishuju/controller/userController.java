package com.example.wuweishuju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
