package com.controller.question3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

//    Question 3
    @RequestMapping("/")
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    
//    Question 4
    @RequestMapping("/hello")
    @ResponseBody
    public String getHello() {
        return "Hello World";
    }
    
}
