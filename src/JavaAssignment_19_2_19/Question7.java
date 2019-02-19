package JavaAssignment_19_2_19;

class Student{
    static String firstName;
    static String lastName;
    static int age;
    static{
        firstName = "Gaurav";
        lastName = "Gandhi";
        age = 22;
    }
    static void printDetails(){
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name : "+lastName);
        System.out.println("Age : "+age);
    }
}
public class Question7 {
    public static void main(String[] args) {
        Student.printDetails();
    }
}
