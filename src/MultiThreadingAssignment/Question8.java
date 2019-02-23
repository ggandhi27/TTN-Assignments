//Schedule task using schedule(), scheduleAtFixedRate() and scheduleAtFixedDelay().

package MultiThreadingAssignment;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class RunnableClass implements Runnable{
    
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(new Date());
    }
}

public class Question8 {
    public static void main(String[] args) throws InterruptedException {
        
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    
        System.out.println("Using Schedule method ::\n");
        scheduledExecutorService.schedule(new RunnableClass(),2,TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new RunnableClass(),2,TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new RunnableClass(),2,TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new RunnableClass(),2,TimeUnit.SECONDS);
    
        Thread.sleep(20000);
        System.out.println("Using ScheduleAtFixedRate method ::\n");
        
      
        scheduledExecutorService.scheduleAtFixedRate(new RunnableClass(), 2,1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new RunnableClass(), 2,1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new RunnableClass(), 2,1, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(new RunnableClass(), 2,1, TimeUnit.SECONDS);
    
        Thread.sleep(20000);
        System.out.println("Using scheduleWithFixedDelay method ::\n");
        
        try {
            scheduledExecutorService.scheduleWithFixedDelay(new RunnableClass(), 2, 2, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleWithFixedDelay(new RunnableClass(), 2, 2, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleWithFixedDelay(new RunnableClass(), 2, 2, TimeUnit.SECONDS);
            scheduledExecutorService.scheduleWithFixedDelay(new RunnableClass(), 2, 2, TimeUnit.SECONDS);
        }
        finally {
            scheduledExecutorService.shutdown();
        }
    
        Thread.sleep(20000);
    }
}
