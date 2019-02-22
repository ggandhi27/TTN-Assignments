package JavaAssignment_21_2_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question8 {
    public static void main(String[] args) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
        str = "";
        System.out.println("Using while loop.");
        System.out.print("Enter a string :: ");
        str=p.readLine();
        
        //Using while loop.
        while(!str.equals("done")){
            if(str.charAt(0) == str.charAt(str.length()-1)){
                System.out.println("First and last characters are equal.");
            }
            System.out.print("Enter a string :: ");
            str=p.readLine();
        }
        
        str="";
        System.out.println("Using do while");
        //Using do while.
        
        do{
        
            if(!str.equals("")){
                if(str.charAt(0) == str.charAt(str.length()-1)){
                    System.out.println("First and last characters are equal.");
                }
            }
            System.out.print("Enter a string :: ");
            str=p.readLine();
        
        }while (!str.equals("done"));
    }
}
