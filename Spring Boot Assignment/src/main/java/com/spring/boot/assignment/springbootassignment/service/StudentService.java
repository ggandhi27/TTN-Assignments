package com.spring.boot.assignment.springbootassignment.service;

import com.spring.boot.assignment.springbootassignment.entity.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    
    public List<Student> getStudentList() {
        return Arrays.asList(new Student("STU001","Gaurav","Gandhi"),
                new Student("STU002","Chirag","Gandhi"));
    }
    
}
