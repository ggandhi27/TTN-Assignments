//Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.

package MultiThreadingAssignment;


class Example{
    
    int count;
    
    Example(){
        count = 0;
    }
    
    public void Increment(){
        count++;
    }
    
    public void func1(){
        for(int i = 1;i<=10;i++){
            Increment();
        }
    }
    public void func2(){
        for(int i = 1;i<=10;i++){
            Increment();
        }
    }
    
}
class Example1{
    
    int count;
    
    Example1(){
        count = 0;
    }
    
    public synchronized void Increment(){
        count++;
    }
    
    public void func1(){
        for(int i = 1;i<=10;i++){
            Increment();
        }
    }
    public void func2(){
        for(int i = 1;i<=10;i++){
            Increment();
        }
    }
    
}


public class Question10Again {
    public static void main(String[] args) throws InterruptedException {
        
        Example example = new Example();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                    example.func1();
            }
        }
        );
        Thread thread2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        example.func2();
                    }
                }
        );
        
        thread1.start();
        thread2.start();
        
        Thread.sleep(5000);
        System.out.println("Without Synchronization :: "+example.count);
        
        Example1 example1 = new Example1();
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                example1.func1();
            }
        }
        );
        Thread thread4 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        example1.func2();
                    }
                }
        );
    
        thread3.start();
        thread4.start();
        
        Thread.sleep(5000);
        System.out.println("With Synchronization :: "+example1.count);
    }
}
