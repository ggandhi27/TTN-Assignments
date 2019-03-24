package com.spring.boot.assignment.springbootassignment.repository;

import com.spring.boot.assignment.springbootassignment.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
