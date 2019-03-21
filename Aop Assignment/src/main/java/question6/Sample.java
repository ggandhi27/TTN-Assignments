package question6;

import java.io.IOException;

public class Sample {
    
    void method1() throws IOException {
        System.out.println("method 1");
        throw new IOException();
    }
    void method2() throws IOException {
        System.out.println("method 2");
        throw new IOException();
    }
    void method3() throws IOException {
        System.out.println("method 3");
        throw new IOException();
    }
    void method4() throws IOException {
        System.out.println("method 4");
        throw new IOException();
    }
    void method5(){
        System.out.println("method 5");
    }
}
