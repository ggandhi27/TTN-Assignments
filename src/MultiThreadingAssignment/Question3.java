package MultiThreadingAssignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        try {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Count " + i + " :: " + Thread.currentThread().getName());
                    }
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Count " + i + " :: " + Thread.currentThread().getName());
                    }
                }
            });
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Count " + i + " :: " + Thread.currentThread().getName());
                    }
                }
            });
        }
        finally {
            executorService.shutdown();
        }
    }
}
