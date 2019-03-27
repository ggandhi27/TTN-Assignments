package com.rest.assignment.restassignment.services;

import com.rest.assignment.restassignment.entity.Student;
import com.rest.assignment.restassignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository studentRepository;
    
    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
    }
    
    public Optional<Student> getSingleStudent(int id) {
        return studentRepository.findById(id);
    }
    
    public void createStudent(Student student) {
        studentRepository.save(student);
    }
    
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
    
    public void updateStudent(Student student) {
        studentRepository.save(student);
    }
}
