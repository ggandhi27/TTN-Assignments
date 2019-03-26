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
    public List<Person> getComplete();
    
    @Query("SELECT COUNT(*) FROM Person WHERE firstname = :firstname")
    int getPersonCountByName(@Param("firstname") String firstname);
    
//    List<Person> findDistinctByAge();

    List<Person> findByFirstnameOrAge(String firstname,Integer age);

    List<Person> findByFirstnameAndAge(String gaurav, int i);

    List<Person> findByAgeBetween(int max,int min);

    List<Person> findBySalaryLessThan(int salary);

    List<Person> findBySalaryGreaterThan(int salary);

    List<Person> findByFirstnameLike(String firstname);

    List<Person> findByFirstnameNot(String firstname);

    List<Person> findByFirstnameIn(List<String> firstnameList);

    List<Person> findByFirstnameIgnoreCase(String firstname);

    @Query("SELECT p FROM Person p where age>25 order by id desc ")
    List<Person> getSortById();

    List<Person> findByAgeGreaterThanOrderByIdDesc(int age);
}