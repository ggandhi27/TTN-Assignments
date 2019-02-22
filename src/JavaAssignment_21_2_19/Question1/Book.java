package JavaAssignment_21_2_19.Question1;


//Abstract classses for abstraction
abstract class Book {
    
    /*      1. Create Java classes having suitable attributes for Library management system.
            Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
    */
    private String bookname;
    private String book_id;
    private String author;
    
    
    public Book(){
    
    }
    public String getBookname() {
        return bookname;
    }
    
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    
    
    public String getBook_id() {
        return book_id;
    }
    
    
    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public Book(String bookname, String book_id, String author) {
        this.bookname = bookname;
        this.book_id = book_id;
        this.author = author;
    }
    
    public abstract void showBooks();
}

