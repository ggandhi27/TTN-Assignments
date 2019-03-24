package com.controller.question3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Controller
public class StudentController {
    
    //    Question 3
    @RequestMapping ("/")
    public ModelAndView getIndex() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    
    //    Question 4
    @RequestMapping ("/hello")
    @ResponseBody
    public String getHello() {
        return "Hello World";
    }

//    Question 5
    @RequestMapping("/HelloWorld")
    @ResponseBody
    public ModelAndView getHelloWorld() { return new ModelAndView("helloworld");}
    
//    Question 6
    @RequestMapping("/details/{firstname}/{lastname}")
    @ResponseBody
    public String getDetails(@PathVariable String firstname,@PathVariable String lastname) {
        return "First Name :: " + firstname + "  <br>Last Name :: " + lastname;
    }
//    public void getDetails(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
//                           @PathVariable String firstname, @PathVariable String lastname) throws IOException {
//        httpServletResponse.setContentType("text/html");
//        httpServletResponse.getWriter().println("First Name :: " + firstname + "<br>Last Name :: " + lastname);
//    }

//    Question 7
    @RequestMapping("/details/{firstname}/{lastname}/{age}")
    @ResponseBody
    public String getDetailsMap(@PathVariable Map<String,String> map) {
        return "First Name :: " + map.get("firstname") + "  <br>Last Name :: " + map.get("lastname") + "" +
                "<br>Age :: " + map.get("age");
    }
}