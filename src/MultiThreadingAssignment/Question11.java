//Use Synchronize block to enable synchronization between multiple threads trying to access method at same time.

package MultiThreadingAssignment;

class SynchronizeBlockExample{
    
    int count;
    
    SynchronizeBlockExample(){
        count=0;
    }
    public void increment(){
        synchronized(this){
            count++;
        }
    
    }
    
    public void func1(){
        for(int i=0;i<10;i++){
            increment();
        }
    }
    
    public void func2(){
        for(int i=0;i<10;i++){
            increment();
        }
    }
    
}

public class Question11 {
    public static void main(String[] args) throws InterruptedException {
        SynchronizeBlockExample synchronizeBlockExample = new SynchronizeBlockExample();
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizeBlockExample.func1();
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizeBlockExample.func2();
            }
        });
        
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
    
        System.out.println("Count :: "+synchronizeBlockExample.count);
        
    }
}
