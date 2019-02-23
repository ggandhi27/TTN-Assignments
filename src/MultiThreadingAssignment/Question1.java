//Create and Run a Thread using Runnable Interface and Thread class.

package MultiThreadingAssignment;

class NewThread implements Runnable{
    
    @Override
    public void run() {
        
        int i;
        for(i=0;i<10;i++){
            System.out.println("count "+i+" :: "+Thread.currentThread().getName());
        }
    
    }
}


public class Question1 {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread();
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj1);
        Thread thread3 = new Thread(obj1);
        Thread thread4 = new Thread(obj1);
        
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread3.setName("Thread 3");
        thread4.setName("Thread 4");
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
