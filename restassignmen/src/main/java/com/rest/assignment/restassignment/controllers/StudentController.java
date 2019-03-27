package com.rest.assignment.restassignment.controllers;

import com.rest.assignment.restassignment.entity.Student;
import com.rest.assignment.restassignment.exceptions.StudentNotFoundException;
import com.rest.assignment.restassignment.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class StudentController {
    
    @Autowired
    StudentService studentService;
    
    
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    
    @GetMapping("/students/{id}")
    public Student getSingleStudent(@PathVariable int id) {
        Student student = studentService.getSingleStudent(id);
        
        if(student == null) {
            throw new StudentNotFoundException("Student with id "+id+" does not exist.");
        }
        return studentService.getSingleStudent(id);
    }
    
    @PostMapping("/students")
    public ResponseEntity<Object> createStudent(@Valid @RequestBody Student student) {
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
        
        Student student = studentService.getSingleStudent(id);
        if(student == null ) {
            throw new StudentNotFoundException("Student to be deleted is not present.");
        }
        studentService.deleteStudent(id);
    }
    
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return student;
    }
    
}
