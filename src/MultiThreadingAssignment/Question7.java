//
package MultiThreadingAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Question7 {
    public static void main(String[] args) {
    
        List<Callable<Integer>> callableList = new ArrayList<Callable<Integer>>();
        List<Future<Integer>> futureList = new ArrayList<Future<Integer>>();
    
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        
        callableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        callableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        callableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
        });
        callableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 4;
            }
        });
        callableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 5;
            }
        });
        
        try{
            futureList = executorService.invokeAll(callableList);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            executorService.shutdown();
        }
    
        try {
            executorService.awaitTermination(3000,TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        futureList.forEach((x)->{
            if(!x.isDone()){
                while(!x.isDone());
            }
            else{
                try {
                    System.out.println("Task no :: "+x.get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        });
        
    }
}
