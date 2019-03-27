package com.rest.assignment.restassignment.repository;

import com.rest.assignment.restassignment.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
