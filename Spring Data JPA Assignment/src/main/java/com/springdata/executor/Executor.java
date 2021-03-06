package com.springdata.executor;

import com.springdata.config.PersistenceConfig;
import com.springdata.entity.Person;
import com.springdata.repository.PersonRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

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
        
        //Question 8
        System.out.println("************************ Question 8 ***********************************");
        System.out.println(personRepository.getComplete());
    
        //Question 9
        System.out.println("************************ Question 9 ***********************************");
        System.out.println(personRepository.getPersonCountByName("Gaurav"));
        
        //Question 10
        System.out.println("************************ Question 10 ***********************************");
        System.out.println("Count :: " + personRepository.count());
//        System.out.println("Find Distinct by age :: \n\n" + personRepository.findDistinctByAge());
        System.out.println("\n******************* Or ******************\n" + personRepository.findByFirstnameOrAge("Gaurav",26));
        System.out.println("\n******************* And ******************\n" + personRepository.findByFirstnameAndAge("Gaurav",26));
        System.out.println("\n Age ::\n " + personRepository.findByAgeBetween(20,25));
        System.out.println("\n Salary Less Than \n" + personRepository.findBySalaryLessThan(1000));
        System.out.println("\n Salary Greater Than \n" + personRepository.findBySalaryGreaterThan(1000));
        System.out.println("\n First Name Like \n" + personRepository.findByFirstnameLike("f%"));
        System.out.println("\n First Name Not \n" + personRepository.findByFirstnameNot("Gaurav"));
        System.out.println("\n First Name In \n" + personRepository.findByFirstnameIn(Arrays.asList("Gaurav","firstname1")));
        System.out.println("\n First Name Ignore Case \n" + personRepository.findByFirstnameIgnoreCase("gaurav"));

        //Question 11
        System.out.println("************************ Question 11 ***********************************");
        System.out.println("\n Order by id, Person having age greater than 25 :: \n" + personRepository.getSortById());

        // Question 12
        System.out.println("************************ Question 12 ***********************************");
        System.out.println("\n Find by Age and order by id :: \n" + personRepository.findByAgeGreaterThanOrderByIdDesc(25));

        //Question 13
        System.out.println("************************ Question 13 ***********************************");
        Page<Person> personPage = personRepository.findAll( new PageRequest(0,3,new Sort(Sort.Direction.DESC,"id")));
        List<Person> personList = personPage.getContent();
    }
}
