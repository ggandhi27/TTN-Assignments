package JavaAssignment_21_2_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question6 {
    
    public static void main(String[] args) {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        
        int a;
        String b;
    
        try {
            System.out.print("Enter a number :: ");
            a = Integer.parseInt(p.readLine());
            System.out.println("Number entered is "+a);
    
            System.out.println("Enter a string");
            b = p.readLine();
            System.out.println("5th character of the string is :: "+b.charAt(5));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.print("You should have entered a longer string :: ");
        }
        finally {
            System.out.println("Have a nice day!");
        }
    
    }
}
