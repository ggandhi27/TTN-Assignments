package com.springdata.repositories;

import com.springdata.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    void delete(Employee deleted);
    
    List<Employee> findAll();
    
    Employee save(Employee persisted);
    
    @Query("SELECT e from Employee e WHERE id=:id")
    List<Employee> findById(@Param ("id") Integer id);
    
    List<Employee> findAllByAgeOrderByIdDesc(Integer age);
    
    List<Employee> findAllByOrderByAge();
}
