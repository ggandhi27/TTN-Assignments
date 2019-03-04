// Implement proxy design for accessing Record of a student and allow the access only to Admin.

package DesignPatterns.Assignment;

interface Accessible{
    void grantAccess();
}

class AccessStudentRecords implements Accessible{
    
    private String empName;
    
    AccessStudentRecords(String empName){
        this.empName = empName;
    }
    
    @Override
    public void grantAccess() {
        System.out.println("Records access granted to employee " + this.empName);
    }
}

class ProxyAccessStudentReords implements Accessible{
    private String empName;
    private AccessStudentRecords accessStudentRecords;
    
    ProxyAccessStudentReords(String empName){
        this.empName = empName;
    }
    
    
    @Override
    public void grantAccess() {
        if(getRole().equals("admin")){
            accessStudentRecords = new AccessStudentRecords(empName);
            accessStudentRecords.grantAccess();
        }
        else {
            System.out.println("Sorry! You are not authorized to the access the records.");
        }
    }
    
    private String getRole(){
        //Roles can be accessed from the database and can be sent to the grantAccess method.
        return "admin";
    }
}

public class Question8 {
    public static void main(String[] args) {
        Accessible accessible = new ProxyAccessStudentReords("Gaurav");
        accessible.grantAccess();
    }
}
