package JavaAssignment_21_2_19.Question1;


import java.util.Date;

public class Library extends Book implements Librarian{
    Student s=new Student();
    private Student stu;
    private String issue_date;
    private String return_date;
    
    public Student getStu() {
        return stu;
    }
    
    public void setStu(Student stu) {
        this.stu = stu;
    }
    
    public String getIssue_date() {
        return issue_date;
    }
    
    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }
    
    public String getReturn_date() {
        return return_date;
    }
    
    
    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }
    
    public void set(String stu ,String stu_id,String bookname, String book_id, String author,String issue_date, String return_date) {
        s.setStu_name(stu);
        s.setStu_id(stu_id);
        setBookname(bookname);
        setBook_id(book_id);
        setAuthor(author);
        setIssue_date(issue_date);
        setReturn_date(return_date);
    }
    public void show(){
        System.out.println("Librarian -"+lib_name);
        System.out.println("Librarian ID -"+lib_id);
    }
    
    public void showBooks(){
        System.out.println("\nAvailable books-");
        System.out.println("Book Name    \t \tID   \tAuthor");
        System.out.println("1)Two States    \t10122 \tChetan Bhagat");
        System.out.println("2)Silent Honor   \t1015  \tCilia Ahern");
        System.out.println("3)Digital Imaging\t1035\tR K Yadav");
        
    }
    
    public void getDetail()
    {
        System.out.println("Student Name- "+s.getStu_name());
        System.out.println("Student id- "+s.getStu_id());
        System.out.println("Book Name- "+getBookname());
        System.out.println("Book ID- "+getBook_id());
        System.out.println("Author Name- "+getAuthor());
        System.out.println("Issue Date- "+getIssue_date());
        System.out.println("Return Date- "+getReturn_date());
        
        
    }
}

