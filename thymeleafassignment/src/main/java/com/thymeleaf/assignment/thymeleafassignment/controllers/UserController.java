package com.thymeleaf.assignment.thymeleafassignment.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.thymeleaf.assignment.thymeleafassignment.entity.User;
import org.hibernate.validator.constraints.EAN;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    List<User> userList = new ArrayList<User>();
    
    @RequestMapping ("/userform")
    ModelAndView userForm(User user) {
        ModelAndView modelAndView = new ModelAndView("userform");
        modelAndView.addObject("user", user);
        return modelAndView;
    }
    
    @RequestMapping ("/submituserform")
    ModelAndView submitUserForm(@ModelAttribute User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            bindingResult.getAllErrors().iterator().forEachRemaining(e-> System.out.println(e));
            return null;
        } else {
            ModelAndView modelAndView = new ModelAndView("resultform");
            System.out.println(user);
            userList.add(user);
            modelAndView.addObject("userlist",userList);
            return modelAndView;
        }
    }
}