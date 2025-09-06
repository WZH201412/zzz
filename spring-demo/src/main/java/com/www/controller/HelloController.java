package com.www.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: qqq
 * @Date: 2025/9/5
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
   }
}

