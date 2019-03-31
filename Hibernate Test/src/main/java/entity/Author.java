package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Author {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (name = "First_Name")
    private String firstname;
    @Column (name = "Last_Name")
    @Transient
    private String lastname;
    @Column (name = "Age")
    private Integer age;
    @Column ( name = "DateOfBirth")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Embedded
    Address address;
    @ElementCollection
    List<String> subjects = new ArrayList<>();
    
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", address=" + address +
                ", subjects=" + subjects +
                '}';
    }
    
    public List<String> getSubjects() {
        return subjects;
    }
    
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
    
    public Author(String firstname, String lastname, Integer age, Date dob, Address address, List<String> subjects) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.subjects = subjects;
    }
    
    public Author(String firstname, String lastname, Integer age, Date dob, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.dob = dob;
        this.address = address;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
//    List<String> subjectList;
    
    public Author(String firstname, String lastname, Integer age, Date dob) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.dob = dob;
    }
    
    public Date getDob() {
        return dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    
    public Author() {
    }
    
    public Author(Integer id, String firstname, String lastname, Integer age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
}
