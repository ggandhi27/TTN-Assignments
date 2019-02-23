//Use Atomic Classes instead of Synchronize method and blocks.

package MultiThreadingAssignment;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicClassExample {
    
    static AtomicInteger count = new AtomicInteger(0);
    
    public static void increment(){
        count.incrementAndGet();
    }
    
    public static void func1(){
        for(int i = 0;i<5;i++){
            increment();
        }
    }
    
    public static void func2(){
        for(int i = 0;i<5;i++){
            increment();
        }
    }
}

public class Question12 {
    public static void main(String[] args) throws InterruptedException {
        
         Thread thread1 = new Thread(new Runnable() {
             @Override
             public void run() {
                    AtomicClassExample.func1();
             }
         });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                AtomicClassExample.func1();
            }
        });
        
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
    
        System.out.println("Count :: "+AtomicClassExample.count);
    }
}
