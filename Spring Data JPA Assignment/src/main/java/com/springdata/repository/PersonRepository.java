package com.springdata.repository;

import com.springdata.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {
    
    public List<Person> findAllByFirstname(String firstname);
    public List<Person> findAllByLastname(String lastname);
    public Person findById(int id);
    
}