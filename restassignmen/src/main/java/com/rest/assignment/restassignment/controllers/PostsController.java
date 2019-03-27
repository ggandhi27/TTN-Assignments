package com.rest.assignment.restassignment.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.security.SecureRandom;

@RestController
public class PostsController {
    
    @GetMapping("/posts")
    public String getPost() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts/";
        ResponseEntity<String> response = restTemplate.getForEntity(url,String.class);
        System.out.println(response.getStatusCode());
        System.out.println(response.getHeaders());
        return response.getBody();
    }
    
    @GetMapping("/posts/{id}")
    public String getSinglePost(@PathVariable int id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/posts/"+id;
        ResponseEntity response = restTemplate.getForEntity(url,String.class);
        System.out.println(response.getStatusCode());
        System.out.println(response.getHeaders());
        return (String) response.getBody();
    }
}
