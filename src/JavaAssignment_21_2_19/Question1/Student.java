package JavaAssignment_21_2_19.Question1;


//Private shows Encapsulation which can be accessed using Getter and Setter
class Student {
    
    private String stu_name;
    private String stu_id;
    
    public String getStu_name() {
        return stu_name;
    }
    
    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }
    
    public String getStu_id() {
        return stu_id;
    }
    
    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
}

