package JavaAssignment_21_2_19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question7 {
    public static void main(String[] args) throws IOException {
        BufferedReader p = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.print("Enter seconds :: ");
        int secs = Integer.parseInt(p.readLine());
        int secs1 = secs;
        int days,hrs,mins;
        days = (secs)/(24*60*60);
        secs = secs%(24*60*60);
        
        hrs = secs/(60*60);
        secs = secs%(60*60);
        
        mins = (secs)/(60);
        secs = secs%60;
    
        System.out.println(secs1+" seconds = "+days+" days "+hrs+" hours "+mins+" mins "+secs+" seconds ");
    }
}
