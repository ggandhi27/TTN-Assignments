package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
    
    @RequestMapping(value = "/submitform",method = RequestMethod.POST)
    @ResponseBody
    String submitForm(String username,String password) {
        return username + " " + password;
    }
}
