package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DummyController {
    
    @RequestMapping ("/")
    @ResponseBody
    String method() {
        return "index String";
    }
    
    @RequestMapping ("/dummy")
    String method1() {
        return "dummy";
    }
    
    @RequestMapping ("/index")
    ModelAndView method2() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
