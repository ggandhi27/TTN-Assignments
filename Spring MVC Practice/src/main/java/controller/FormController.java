package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
@RequestMapping("/form")
public class FormController {
    
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView("form");
        return modelAndView;
    }
    
//    @RequestMapping(value = "/submitform",method = RequestMethod.POST)
    @ResponseBody
    String submitForm(String username,String password) {
        return username + " " + password;
    }
    
    @RequestMapping(value = "/submitform",method = RequestMethod.POST)
    @ResponseBody
    String submitform(@RequestParam("username")String username,
                      @RequestParam("password")String password) {
        return username + " " + password;
    }
}
