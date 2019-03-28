package com.thymeleaf.assignment.thymeleafassignment.controllers;

import com.thymeleaf.assignment.thymeleafassignment.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    
    @RequestMapping("/register")
    ModelAndView getRegister(Employee employee) {
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }
    
    @RequestMapping("/submit")
    @ResponseBody
    Employee submitForm(@ModelAttribute Employee employee, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            bindingResult.getAllErrors().iterator().forEachRemaining(e-> System.out.println(e));
            return null;
        }
        else {
            return employee;
        }
    }
}
