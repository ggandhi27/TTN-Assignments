package com.springboot.demo.Spring.Boot.Demo.controller;

import com.springboot.demo.Spring.Boot.Demo.entity.Book;
import com.springboot.demo.Spring.Boot.Demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    
    @Autowired
    BookService bookService;
    
    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }
}
