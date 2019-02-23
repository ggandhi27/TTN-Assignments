//Use sleep and join methods with thread.

package MultiThreadingAssignment;


public class Question2 {
    public static void main(String[] args)throws InterruptedException {
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("Count "+i+" :: " +Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("Count "+i+" :: " +Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("Count "+i+" :: " +Thread.currentThread().getName());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        
        t1.start();
        t2.start();
        t3.start();
        
        t1.join();
        t2.join();
        t3.join();
    
        System.out.println("\nControl back to main.");
        
    }
}
