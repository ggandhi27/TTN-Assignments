package com.spring.boot.assignment.springbootassignment.controller;

import com.spring.boot.assignment.springbootassignment.entity.Book;
import com.spring.boot.assignment.springbootassignment.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    
    @Autowired
    BookService bookService;
    
    @GetMapping("/getbooklist")
    public List<Book> getBookList() {
        return bookService.getBooks();
    }
}
