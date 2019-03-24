package com.spring.boot.assignment.springbootassignment.service;

import com.spring.boot.assignment.springbootassignment.entity.Book;
import com.spring.boot.assignment.springbootassignment.entity.Student;
import com.spring.boot.assignment.springbootassignment.repository.BookRepository;
import com.spring.boot.assignment.springbootassignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class Bootstrap {
    
    @Autowired
    BookRepository bookRepository;
    
    @Autowired
    StudentRepository studentRepository;
    
    @EventListener(ApplicationStartedEvent.class)
    public void init() {
        Iterator<Book> bookIterator = bookRepository.findAll().iterator();
        if (!bookIterator.hasNext()) {
            for (int i = 1; i <= 10; i++) {
                Book book = new Book(i, "Book " + i, "Author " + i);
                bookRepository.save(book);
                System.out.println("Book " + i + " created");
            }
        }
        
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        if(!studentIterator.hasNext()) {
            for(int i = 0;i<10;i++) {
                Student student = new Student(i,"stu0"+i,"fname"+i,"lname"+i);
                studentRepository.save(student);
                System.out.println("Student "+i+" created");
            }
        }
        System.out.println("Your application is up and running.");
    
    }
}
