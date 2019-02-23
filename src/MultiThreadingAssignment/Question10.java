//Use Synchronize method to enable synchronization between multiple threads trying to access method at same time.

package MultiThreadingAssignment;

class NoSynchronization implements Runnable{
    
    int c = 0;
    
    @Override
    public void run() {
        c++;
        System.out.println(c+" :: "+Thread.currentThread().getName());
    }
}

class Synchronized implements Runnable{
    
    int c=0;
    @Override
    public synchronized void run() {
        c++;
        System.out.println(c+" :: "+Thread.currentThread().getName());
    }
}

public class Question10 {
    public static void main(String[] args) throws InterruptedException {
        
        NoSynchronization noSynchronization = new NoSynchronization();
    
        System.out.println("Created non synchronized threads :: ");
        
        Thread thread1 = new Thread(noSynchronization);
        Thread thread2 = new Thread(noSynchronization);
        Thread thread3 = new Thread(noSynchronization);
        Thread thread4 = new Thread(noSynchronization);
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        
        Thread.sleep(4000);
        
        Synchronized syn = new Synchronized();
        
        System.out.println("Created synchronized threads :: ");
    
        Thread thread5 = new Thread(syn);
        Thread thread6 = new Thread(syn);
        Thread thread7 = new Thread(syn);
        Thread thread8 = new Thread(syn);
    
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
    
        Thread.sleep(4000);
        
    }
}
