//Use Reentract lock for coordinating 2 threads with signal(), signalAll() and wait().

package MultiThreadingAssignment;

import java.util.concurrent.locks.ReentrantLock;

class RentrantLockExample{
    
    ReentrantLock lock = new ReentrantLock(true);
    int count;
    
    public void increment(){
        lock.lock();
        count++;
        lock.unlock();
    }
    
    public void func1(){
        for(int i = 0;i<5;i++){
            increment();
        }
    }
    
    public void func2(){
        for(int i = 0;i<5;i++){
            increment();
        }
    }
    
}

public class Question15 {
    public static void main(String[] args) throws InterruptedException {
        RentrantLockExample rentrantLockExample = new RentrantLockExample();
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                rentrantLockExample.func1();
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                rentrantLockExample.func2();
            }
        });
        
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
    
        System.out.println("Count :: "+rentrantLockExample.count);
    }
}
