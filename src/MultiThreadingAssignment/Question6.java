// Return a Future from ExecutorService by using callable and use get(), isDone(),
// isCancelled() with the Future object to know the status of task submitted.

package MultiThreadingAssignment;

import java.util.concurrent.*;

public class Question6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        Future<Integer> future;
        try {
            future = executorService.submit(() -> 10);
        }
        finally {
            executorService.shutdown();
        }
        
        //Waits until future is not completed.
        while(!future.isDone());
    
        //checks if the future was cancelled or not.
        if(future.isCancelled()){
            System.out.println("The future was cancelled.");
        }
        else {
            //Prints the value returned to the future.
            System.out.println("Future returns :: "+future.get());
        }
    }
}
