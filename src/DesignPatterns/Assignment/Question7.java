package DesignPatterns.Assignment;

import java.util.ArrayList;
import java.util.List;

interface Directory{
    void showDirectory();
}

class JVMEmployee implements Directory{
    
    private String name;
    private final String competency;
    
    JVMEmployee(String name){
        this.competency = "JVM";
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCompetency() {
        return competency;
    }
    
    @Override
    public void showDirectory() {
        System.out.println("JVMEmployee{" +
                "name='" + name + '\'' +
                ", competency='" + competency + '\'' +
                '}');
    
    }
    
    @Override
    public String toString() {
        return "JVMEmployee{" +
                "name='" + name + '\'' +
                ", competency='" + competency + '\'' +
                '}';
    }
}

class DevopsEmployee implements Directory{
    
    private String name;
    private final String competency;
    
    DevopsEmployee(String name){
        this.competency = "Devops";
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getCompetency() {
        return competency;
    }
    
    @Override
    public void showDirectory() {
        System.out.println("DevopsEmployee{" +
                "name='" + name + '\'' +
                ", competency='" + competency + '\'' +
                '}');
    }
    
    @Override
    public String toString() {
        return "DevopsEmployee{" +
                "name='" + name + '\'' +
                ", competency='" + competency + '\'' +
                '}';
    }
}

class JVMEmployeeDirectory implements Directory{
    
    List<Directory> directoryList = new ArrayList<>();
    
    @Override
    public void showDirectory() {
        System.out.println("JVM Employee Directories");
        directoryList.forEach((e)->e.showDirectory());
    }
}


class DevopsEmployeeDirectory implements Directory{
    
    List<Directory> directoryList = new ArrayList<>();
    
    @Override
    public void showDirectory() {
        System.out.println("Devops Employee Directories");
        directoryList.forEach((e)->e.showDirectory());
    }
}

class Company implements Directory{
    
    List<Directory> directoryList = new ArrayList<>();
    @Override
    public void showDirectory() {
        directoryList.forEach((e)->e.showDirectory());
    }
}

public class Question7 {
    public static void main(String[] args) {
        JVMEmployee jvmEmployee = new JVMEmployee("Gaurav");
        JVMEmployee jvmEmployee1 = new JVMEmployee("Abhibhek");
        
        DevopsEmployee devopsEmployee = new DevopsEmployee("Vibhav");
        DevopsEmployee devopsEmployee1 = new DevopsEmployee("Nipun");
        
        JVMEmployeeDirectory jvmEmployeeDirectory = new JVMEmployeeDirectory();
        jvmEmployeeDirectory.directoryList.add(jvmEmployee);
        jvmEmployeeDirectory.directoryList.add(jvmEmployee1);
        
        DevopsEmployeeDirectory devopsEmployeeDirectory = new DevopsEmployeeDirectory();
        devopsEmployeeDirectory.directoryList.add(devopsEmployee);
        devopsEmployeeDirectory.directoryList.add(devopsEmployee1);
        
        Company company = new Company();
        company.directoryList.add(jvmEmployeeDirectory);
        company.directoryList.add(devopsEmployeeDirectory);
        
        company.showDirectory();
    }
}
