package MultiThreadingAssignment;

class WaitAndNotifyAllExample{
    
    public void func1() throws InterruptedException {
        
        synchronized (this){
            System.out.println("Thread1 started.");
            wait();
            System.out.println("Thread1 started.");
        }
    }
    
    public void func2() throws InterruptedException {
        synchronized (this){
            System.out.println("Thread2 started.");
            wait();
            System.out.println("Thread2 started.");
        }
        
    }
    public void func3() throws InterruptedException {
    
        synchronized (this){
            System.out.println("Thread3 started.");
            System.out.println("Thread3 started.");
            notifyAll();
        }
    }
    
}

public class Question14 {
    public static void main(String[] args) throws InterruptedException {
        WaitAndNotifyAllExample waitAndNotifyAllExample = new WaitAndNotifyAllExample();
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotifyAllExample.func1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotifyAllExample.func2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    waitAndNotifyAllExample.func3();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        thread1.start();
        thread2.start();
        thread3.start();
        
        thread1.join();
        thread2.join();
        thread3.join();
    }
}
