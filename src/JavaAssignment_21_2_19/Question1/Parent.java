package JavaAssignment_21_2_19.Question1;

import java.util.Scanner;

public class Parent{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Library lb1=new Library();
        lb1.show();
        lb1.showBooks();
        System.out.println("\nEnter the Student Name and ID");
        String name=s.nextLine();
        String id=s.next();
        s.nextLine();
        System.out.println("Enter Book Name and Book id");
        String bookname=s.nextLine();
        String id1=s.next();
        System.out.println("Enter the author name");
        s.nextLine();
        
        String author1=s.nextLine();
        
        System.out.println("Enter issue date");
        String issu=s.nextLine();
        System.out.println("Enter the return date");
        String ret=s.nextLine();
        lb1.set(name,id,bookname,id1,author1,issu,ret);
        System.out.println("\n Press 1 to display the record of issuer");
        int ch=s.nextInt();
        if(ch==1){
            lb1.getDetail();
        }
        else
        {
            System.exit(0);
        }
        
        
        
    }
    
    
}

