package com.springdata.repositories;

import com.springdata.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    void delete(Employee deleted);
    
    List<Employee> findAll();
    
    Employee save(Employee persisted);
}
