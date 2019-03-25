package com.springdata.demo;

import com.springdata.config.PersistenceContext;
import com.springdata.entity.Employee;
import com.springdata.repositories.EmployeeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DummyMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceContext.class);
        EmployeeRepository employeerepository = applicationContext.getBean(EmployeeRepository.class);
        
        Employee employee = new Employee();
        employee.setAge(23);
        employee.setName("Peter");
        employee.setSalary(10000);
        employeerepository.save(employee);
        Employee employee1 = new Employee("Amanda",23,12252);
        employeerepository.save(employee1);
    
        for(Employee e:employeerepository.findById(1)){
            System.out.println(e);
        }
    
        System.out.println(employeerepository.findById(2));
    
        System.out.println(employeerepository.findAllByAgeOrderByIdDesc(23));
    
        System.out.println(employeerepository.findAllByOrderByAge());
    }
}
