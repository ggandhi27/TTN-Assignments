// Use isShutDown() and isTerminate() with ExecutorService.
package MultiThreadingAssignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question5 {
    public static void main(String[] args) {
    
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Thread ::" + Thread.currentThread().getName() + " :: i :: " + i);
                    }
                }
            });
        }
        finally {
            executorService.shutdown();
        }
        
        if(executorService.isShutdown()){
            System.out.println("Executor Service is shut down.");
        }
        
        while(!executorService.isTerminated());
        System.out.println("Executor Service is terminated.");
    }
}
