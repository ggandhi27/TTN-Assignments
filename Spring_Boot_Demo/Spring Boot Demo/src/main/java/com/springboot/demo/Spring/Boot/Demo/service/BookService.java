package com.springboot.demo.Spring.Boot.Demo.service;

import com.springboot.demo.Spring.Boot.Demo.entity.Book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    
    public List<Book> getBooks() {
        return Arrays.asList(new Book(1,"Book1","Author1"),
                new Book(2,"Book2","Author2"));
    }
}
