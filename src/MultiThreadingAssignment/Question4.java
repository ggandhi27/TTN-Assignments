//Try shutdown() and shutdownNow() and observe the difference.
package MultiThreadingAssignment;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question4 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        
        try{
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    int i;
                    for(i=0;i<5;i++){
                        System.out.println("Submitted " + i);
                    }
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    int i;
                    for(i=0;i<5;i++){
                        System.out.println("Submitted " + i);
                    }
                }
            });
        }
        finally {
            executorService.shutdown();
        }
        ExecutorService executorService1 = Executors.newSingleThreadScheduledExecutor();
    
        try{
            executorService1.execute(new Runnable() {
                @Override
                public void run() {
                    int i;
                    for(i=0;i<5;i++){
                        System.out.println("Submitted 2nd Executor" + i);
                    }
                }
            });
            executorService1.execute(new Runnable() {
                @Override
                public void run() {
                    int i;
                    for(i=0;i<5;i++){
                        System.out.println("Submitted 2nd Executor" + i);
                    }
                }
            });
        }
        finally {
            
            executorService1.shutdownNow();
        }
    }
}
