package com.spring.boot.assignment.springbootassignment.service;

import com.spring.boot.assignment.springbootassignment.entity.Book;
import com.spring.boot.assignment.springbootassignment.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class BookService {
    
    @Autowired
    BookRepository bookRepository;
    
    public List<Book> getBooks() {
        List<Book> bookList = new ArrayList<Book>();
        Iterator<Book> bookIterator = bookRepository.findAll().iterator();
        bookIterator.forEachRemaining(bookList::add);
        return bookList;
    }
    
}
