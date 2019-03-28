package com.thymeleaf.assignment.thymeleafassignment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
    
    @RequestMapping("hello")
    String getHello() {
        return "hello";
    }
}
