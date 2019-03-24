package com.spring.boot.assignment.springbootassignment.repository;

import com.spring.boot.assignment.springbootassignment.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {
}
