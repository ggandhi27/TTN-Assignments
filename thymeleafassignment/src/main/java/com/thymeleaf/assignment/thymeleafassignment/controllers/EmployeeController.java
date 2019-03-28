package com.thymeleaf.assignment.thymeleafassignment.controllers;

import com.thymeleaf.assignment.thymeleafassignment.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    
    List<Employee> employeeList = new ArrayList<Employee>();
    
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
    
    @RequestMapping("/dynamicregister")
    ModelAndView getDynamicRegister(Employee employee) {
        ModelAndView modelAndView = new ModelAndView("dynamicregister");
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }
    
    @RequestMapping("/submitdynamic")
    ModelAndView submitDynamicForm(@ModelAttribute Employee employee) {
        ModelAndView modelAndView = new ModelAndView("submitdynamic");
        employeeList.add(employee);
        modelAndView.addObject("employeelist",employeeList);
        return modelAndView;
    }
}
