// Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name

package CollectionsAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Employee {
    private String name;
    private Double salary;
    private Double age;
    
    public String getName() {
        return name;
    }
    
    public Double getSalary() {
        return salary;
    }
    
    public Double getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public void setAge(Double age) {
        this.age = age;
    }
    
}

class EmployeeComparator implements Comparator<Employee>{
    
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSalary() == o2.getSalary())
            return 0;
        else if(o1.getSalary()<o2.getSalary())
            return 1;
        else
            return -1;
    }
}

public class Question4 {
    public static void main(String[] args) throws IOException {
        int n;
        
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.print("Enter the number of employees you want to add ::");
        n = Integer.parseInt(p.readLine());
        int i;
    
        List<Employee> employeeList = new ArrayList<>();
        
        for(i = 0;i<n;i++){
            Employee obj = new Employee();
            System.out.print("Enter the name of employee no "+i+" :: ");
            obj.setName(p.readLine());
            System.out.print("Enter the age of employee no "+i+" :: ");
            obj.setAge(Double.parseDouble(p.readLine()));
            System.out.print("Enter the salary of employee no "+i+" :: ");
            obj.setSalary(Double.parseDouble(p.readLine()));
            employeeList.add(obj);
        }
    
        Collections.sort(employeeList,new EmployeeComparator());
    
        Iterator<Employee> employeeIterator = employeeList.iterator();
        System.out.println("\n\nSorted List according to salary ::\n\n");
        while (employeeIterator.hasNext()){
            Employee obj = employeeIterator.next();
            System.out.println("Name :: "+obj.getName());
            System.out.println("Age :: "+obj.getAge());
            System.out.println("Salary :: "+obj.getSalary());
            System.out.println("-----------------------------");
        }
    }
}