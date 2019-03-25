package com.springdata.repository;

import com.springdata.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person,Integer> {
    
    public List<Person> findAllByFirstname(String firstname);
    public List<Person> findAllByLastname(String lastname);
    public Person findById(int id);
    
    @Query("SELECT firstname from Person where age=25")
    public List<String> findFirstName();
    
    @Query("SELECT firstname,lastname from Person where age=23")
    public Object[] findFirstAndLast();
    
    @Query("SELECT p FROM Person p where age=23")
    public Person getComplete();
    
    @Query("SELECT COUNT(*) FROM Person WHERE firstname = :firstname")
    int getPersonCountByName(@Param("firstname") String firstname);
}