package com.springdata.demo;

import com.springdata.config.PersistenceContext;
import com.springdata.entity.Employee;
import com.springdata.repositories.EmployeeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DummyMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceContext.class);
    
        Employee employee = new Employee();
        employee.setAge(23);
        employee.setName("Peter");
        employee.setSalary(10000);
        EmployeeRepository employeeRepository = applicationContext.getBean(EmployeeRepository.class);
        employeeRepository.save(employee);
        
    }
}
