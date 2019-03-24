package com.spring.boot.assignment.springbootassignment.controller;

import com.spring.boot.assignment.springbootassignment.entity.Student;
import com.spring.boot.assignment.springbootassignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    
    @Autowired
    StudentService studentService;
    
    @GetMapping("/getstudent")
    public List<Student> getStudentList() {
        return studentService.getStudentList();
    }
    
    @GetMapping("/getstudentlist")
    public List<Student> getStudentDBList() {
        return studentService.getStudentDBList();
    }
}
