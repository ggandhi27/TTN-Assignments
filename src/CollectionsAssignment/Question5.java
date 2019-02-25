// Write a program to sort the Student objects based on Score , if the score are same then sort on First Name .
// Class Student{ String Name; Double Score; Double Age

package CollectionsAssignment;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Student {
    private String name;
    private Double score;
    private Double age;
    
    public String getName() {
        return name;
    }
    
    public Double getScore() {
        return score;
    }
    
    public Double getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setScore(Double score) {
        this.score = score;
    }
    
    public void setAge(Double age) {
        this.age = age;
    }
    
}

class StudentComparator implements Comparator<Student> {
    
    
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getScore()>o2.getScore()){
            return 1;
        }
        else if(o1.getScore()<o2.getScore()){
            return -1;
        }
        else{
            return o1.getName().compareTo(o2.getName());
        }
    }
}


public class Question5 {
    public static void main(String[] args) throws IOException {
        int n;
    
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.print("Enter the number of students you want to add ::");
        n = Integer.parseInt(p.readLine());
        int i;
    
        List<Student> studentList = new ArrayList<>();
    
    
        for(i = 0;i<n;i++){
            Student obj = new Student();
            System.out.print("Enter the name of Student no "+i+" :: ");
            obj.setName(p.readLine());
            System.out.print("Enter the age of Student no "+i+" :: ");
            obj.setAge(Double.parseDouble(p.readLine()));
            System.out.print("Enter the score of Student no "+i+" :: ");
            obj.setScore(Double.parseDouble(p.readLine()));
            studentList.add(obj);
        }
    
        Collections.sort(studentList,new StudentComparator());
    
        Iterator<Student> studentIterator = studentList.iterator();
        System.out.println("\n\nSorted List according to score ::\n\n");
        
        while (studentIterator.hasNext()){
            Student obj;
            obj = (Student) studentIterator.next();
            System.out.println("Name :: "+obj.getName());
            System.out.println("Age :: "+obj.getAge());
            System.out.println("Score :: "+obj.getScore());
            System.out.println("-----------------------------");
        }
    }
}
