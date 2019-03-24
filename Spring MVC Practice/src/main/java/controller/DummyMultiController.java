package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
@RequestMapping("/dummy2")
public class DummyMultiController {
    
    @RequestMapping("index")
    @ResponseBody
    String index() {
        return "index";
    }
    
    @RequestMapping("demoAction")
    @ResponseBody
    String demoAction() {
        return "demoAction";
    }
    
    @RequestMapping("indexPage")
    ModelAndView indexPage() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
