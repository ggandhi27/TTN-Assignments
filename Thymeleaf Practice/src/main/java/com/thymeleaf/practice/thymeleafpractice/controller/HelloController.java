package com.thymeleaf.practice.thymeleafpractice.controller;

import com.thymeleaf.practice.thymeleafpractice.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.soap.SOAPBinding;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

//@RequestMapping("/")
@Controller
public class HelloController {
    
    List<User> userList = new ArrayList<User>();
    
    @RequestMapping ("sayHello")
    public String sayHello() {
        return "hello";
    }
    
    @RequestMapping(value = "show",method = RequestMethod.GET)
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("show");
        return modelAndView;
    }
    
    @RequestMapping(value="register")
    public ModelAndView register(User user) {
        ModelAndView modelAndView = new ModelAndView("register");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
    
    @RequestMapping(value = "submit",method = RequestMethod.POST)
    public ModelAndView submit(@ModelAttribute @Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("submit");
        modelAndView.addObject("users", userList);
        if(bindingResult.hasErrors()){
            bindingResult.getAllErrors().iterator().forEachRemaining(System.out::println);
            return null;
        }
        else {
            userList.add(user);
            System.out.println(userList.size());
            return modelAndView;
        }
    }
}
