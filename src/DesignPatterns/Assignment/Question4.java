//Implement Builder pattern to create a student object with more than 6 fields.

package DesignPatterns.Assignment;

class Student{
    private String name;
    private String id;
    private String branch;
    private String hometown;
    private String motherName;
    private String fatherName;
    
    Student(StudentBuilder studentBuilder){
        this.name = studentBuilder.getName();
        this.id = studentBuilder.getId();
        this.branch = studentBuilder.getBranch();
        this.hometown = studentBuilder.getHometown();
        this.fatherName = studentBuilder.getFatherName();
        this.motherName = studentBuilder.getMotherName();
    }
    
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", branch='" + branch + '\'' +
                ", hometown='" + hometown + '\'' +
                ", motherName='" + motherName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}

class StudentBuilder{
    private String name;
    private String id;
    private String branch;
    private String hometown;
    private String motherName;
    private String fatherName;
    
    public String getName() {
        return name;
    }
    
    public String getId() {
        return id;
    }
    
    public String getBranch() {
        return branch;
    }
    
    public String getHometown() {
        return hometown;
    }
    
    public String getMotherName() {
        return motherName;
    }
    
    public String getFatherName() {
        return fatherName;
    }
    
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    public StudentBuilder setId(String id) {
        this.id = id;
        return this;
    }
    
    public StudentBuilder setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    
    public StudentBuilder setHometown(String hometown) {
        this.hometown = hometown;
        return this;
    }
    
    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }
    
    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }
    public Student getStudent(){
        return new Student(this);
    }
}
public class Question4 {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        Student student = studentBuilder.setName("Rahul Gandhi")
                .setBranch("Congress")
                .setFatherName("Rajeev Gandhi")
                .setHometown("Bareli")
                .setMotherName("Sonia Gandhi")
                .setId("420")
                .getStudent();
    
        System.out.println(student);
    }
}
