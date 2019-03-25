package com.springdata.executor;

import com.springdata.config.PersistenceConfig;
import com.springdata.entity.Person;
import com.springdata.repository.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Executor {
    
    private static Object[] firstAndLast;
    
    public static void populateTable(PersonRepository personRepository) {
        int i;
        for(i = 0;i<10;i++) {
            Person person = new Person();
            
            double randomDouble = Math.random();
            randomDouble = randomDouble * 50 + 1;
            person.setAge((int) randomDouble);
            
            randomDouble = Math.random();
            randomDouble = randomDouble * 10000 + 1;
            person.setSalary((int)randomDouble);
            
            person.setFirstname("firstname"+i);
            person.setLastname("lastname"+i);
            
            personRepository.save(person);
        }
    }
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceConfig.class);
        PersonRepository personRepository = applicationContext.getBean(PersonRepository.class);
        
        Person person = new Person();
        person.setAge(23);
        person.setFirstname("Gaurav");
        person.setLastname("Gandhi");
        person.setSalary(1500);
        
        personRepository.save(person);
        
        populateTable(personRepository);
        
        
        //Question 3
        System.out.println("************************ Question 3 ***********************************");
        System.out.println(personRepository.findOne(4));
        System.out.println(personRepository.exists(8));
        System.out.println(personRepository.findAll());
        System.out.println(personRepository.count());
        personRepository.delete(5);
        
        //Question 4
        System.out.println("************************ Question 4,5 ***********************************");
        System.out.println("First Name ::");
        System.out.println(personRepository.findAllByFirstname("Gaurav"));
        System.out.println("Last Name ::");
        System.out.println(personRepository.findAllByLastname("Gandhi"));
        System.out.println(personRepository.findById(6));
        
        //Question 6
        System.out.println("************************ Question 6 ***********************************");
        System.out.println(personRepository.findFirstName());
        
        //Question 7
        System.out.println("************************ Question 7 ***********************************");
        firstAndLast = personRepository.findFirstAndLast();
        System.out.println(firstAndLast);
        
        
    }
}
