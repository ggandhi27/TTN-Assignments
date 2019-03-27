package com.rest.assignment.restassignment.controllers;

import com.rest.assignment.restassignment.entity.Name;
import com.rest.assignment.restassignment.entity.Student;
import com.rest.assignment.restassignment.entity.StudentV1;
import com.rest.assignment.restassignment.entity.StudentV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentVersionController {
    
    @GetMapping("/student/V1")
    StudentV1 getStudentV1() {
        return new StudentV1("Gaurav Gandhi");
    }
    
    @GetMapping("/student/V2")
    StudentV2 getStudentV2() {
        return new StudentV2(new Name("Gandhi","Gaurav"));
    }
    
    @GetMapping(value = "/student/param",params = "version=1")
    StudentV1 getStudentParam1() {
        return new StudentV1("Gaurav Gandhi");
    }
    
    @GetMapping(value = "/student/param",params = "version=2")
    StudentV2 getStudentParam2() {
        return new StudentV2(new Name("Gandhi","Gaurav"));
    }
    
    @GetMapping(value = "/student/head",headers = "API-VERSION=1")
    StudentV1 getStudentHeader1() {
        return new StudentV1("Gaurav Gandhi");
    }
    
    @GetMapping(value = "/student/head",headers = "API-VERSION=2")
    StudentV2 getStudentHeader2() {
        return new StudentV2(new Name("Gandhi","Gaurav"));
    }
    
    //Accept application/app-v1+json header required with request
    @GetMapping(value = "/student/produces",produces = "application/app-v1+json")
    StudentV1 getStudentProducer1() {
        return new StudentV1("Peter Parker");
    }
    
    @GetMapping(value = "/student/produces",produces = "application/app-v2+json")
    StudentV2 getStudnetProducer2() {
        return new StudentV2(new Name("Peter","Parker"));
    }
}
