package com.spring.boot.assignment.springbootassignment.service;

import com.spring.boot.assignment.springbootassignment.entity.Student;
import com.spring.boot.assignment.springbootassignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepository;
    
    public List<Student> getStudentList() {
        return Arrays.asList(new Student("STU001","Gaurav","Gandhi"),
                new Student("STU002","Chirag","Gandhi"));
    }
    
    public  List<Student> getStudentDBList() {
        List<Student> studentList = new ArrayList<Student>();
    
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        
        studentIterator.forEachRemaining(studentList::add);
        
        return studentList;
    }
}
