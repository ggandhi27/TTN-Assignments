// Create an Employee Class with instance variables (String) name,
// (Integer)age, (String)city and get the instance of the Class
// using constructor reference


package Java8_Assignment;

class Employee{
    private String name;
    private Integer age;
    private String city;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

@FunctionalInterface
interface EmployeeInterface{
    public Employee getInstance();
}

public class Question4 {
    public static void main(String[] args) {
        EmployeeInterface employeeInterface = Employee::new;
        Employee employee = employeeInterface.getInstance();
        
        employee.setName("Gaurav");
        employee.setAge(23);
        employee.setCity("Noida");
    
        System.out.println(employee);
    }
}
