//Increase concurrency with Thread pools using newCachedThreadPool() and newFixedThreadPool().



package MultiThreadingAssignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunnableClassCachedThread implements Runnable{
    
    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println(i + " Cached Thread :: "+Thread.currentThread().getName());
        }
    }
}
class RunnablClassFixedThread implements Runnable{
    
    @Override
    public void run() {
        for(int i = 0;i<5;i++){
            System.out.println(i + " Fixed Thread:: "+Thread.currentThread().getName());
        }
    }
}

public class Question9 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        RunnableClassCachedThread runnableClass1 = new RunnableClassCachedThread();
        
        try {
            executorService.execute(runnableClass1);
            executorService.execute(runnableClass1);
            executorService.execute(runnableClass1);
            executorService.execute(runnableClass1);
            executorService.execute(runnableClass1);
        }
        finally {
            executorService.shutdown();
        }
        
        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        
        RunnablClassFixedThread runnablClassFixedThread = new RunnablClassFixedThread();
        
        try{
            executorService1.execute(runnablClassFixedThread);
            executorService1.execute(runnablClassFixedThread);
            executorService1.execute(runnablClassFixedThread);
            executorService1.execute(runnablClassFixedThread);
            executorService1.execute(runnablClassFixedThread);
            executorService1.execute(runnablClassFixedThread);
            executorService1.execute(runnablClassFixedThread);
            executorService1.execute(runnablClassFixedThread);
            executorService1.execute(runnablClassFixedThread);
        }
        finally {
            executorService1.shutdown();
        }
        
    }
}
