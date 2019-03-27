package com.rest.assignment.restassignment.controllers;

import com.rest.assignment.restassignment.entity.Student;
import com.rest.assignment.restassignment.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    
    @Autowired
    StudentService studentService;
    
    
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    
    @GetMapping("/students/{id}")
    public Optional<Student> getSingleStudent(@PathVariable int id) {
        Optional<Student> student = studentService.getSingleStudent(id);
        return student;
    }
    
    @PostMapping("/students")
    public ResponseEntity<Object> createStudent(@RequestBody Student student) {
        studentService.createStudent(student);
    
        URI uri = ServletUriComponentsBuilder.
                fromCurrentRequest().
                path("{id}").
                buildAndExpand(student.getId()).
                toUri();
        
        return ResponseEntity.created(uri).build();
    
    }
    
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
    
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return student;
    }
    
}
