package com.yang.swagger2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController {

    @GetMapping("/hi")
    public Object hi(String name) {
        return "hello" + name;
    }
}