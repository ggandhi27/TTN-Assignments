package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
    
    @Id
    private Integer id;
    private String name;
    
    public Subject() {
    }
    
    public Subject(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
