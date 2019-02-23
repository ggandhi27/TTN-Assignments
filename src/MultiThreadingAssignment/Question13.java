//Coordinate 2 threads using wait() and notify().
package MultiThreadingAssignment;

class WaitNotifyExample {
    public void func1() throws InterruptedException {
        
        
        synchronized (this){
            System.out.println("Thread1 started.");
            wait();
            System.out.println("Thread1 Ended");
        }
        
    }
    public void func2() throws InterruptedException {
        
        
        synchronized (this){
            System.out.println("Thread2 started.");
            System.out.println("Thread2 Ended");
            notify();
        }
        
    }
}

public class Question13 {
    public static void main(String[] args) throws InterruptedException {
        WaitNotifyExample waitNotifyExample = new WaitNotifyExample();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitNotifyExample.func1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitNotifyExample.func2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ;
            }
        });
        thread1.start();
        thread2.start();
        
        thread1.join();
        thread2.join();
        
    }
}
