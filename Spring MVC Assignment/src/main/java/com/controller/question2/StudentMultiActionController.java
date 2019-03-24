package com.controller.question2;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentMultiActionController extends MultiActionController {

//    http://localhost:8080/studentmultiaction/getIndex
//    copy the above link and paste in the web browser after running tomcat from command line using
//    gradle :tomcatRun
    
    public ModelAndView getIndex(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    
//    http://localhost:8080/studentmultiaction/getHtml
//    copy the above link and paste in the web browser after running tomcat from command line using
//    gradle :tomcatRun
    public void getHtml(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.setContentType("text/html");
        httpServletResponse.getWriter().println("<h1>Showing you html</h1>");
    }
}
