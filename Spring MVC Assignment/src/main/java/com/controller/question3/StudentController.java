package com.controller.question3;

import com.entity.StudentCo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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
    
//    Question 8
    @RequestMapping("/form")
    public ModelAndView getForm() {
        return new ModelAndView("form");
    }
    
    @RequestMapping(value = "/submitform",method = RequestMethod.POST)
    @ResponseBody
    public String submitForm(@RequestParam("firstname") String firstname,
                             @RequestParam("lastname") String lastname) {
        return "First Name :: " + firstname + "<br>Last Name :: " + lastname;
    }
    
//    Question 9
    @RequestMapping(value = "newStudent", method = RequestMethod.POST)
    @ResponseBody
    public String submitStudent(StudentCo student) {
        return student.toString();
    }
    
    //Exercise 10
    @ModelAttribute
    public void addHeading(Model model) {
        model.addAttribute("heading", "Spring MVC Demo");
    }
}