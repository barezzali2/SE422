package Week4.Mar2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String... args) {

        int cores = Runtime.getRuntime().availableProcessors();

        ExecutorService pool = Executors.newFixedThreadPool(cores + 1);

        for(int i = 0; i < 4; i++) {
            Thread t = new Thread(() -> {
                for(int j = 1; j <= 10; j++) {
                    System.out.println("Thread pool" + j);
                }
            });

            pool.submit(t);
        }

        // Runnable t1 = new Thread(() -> {
        //     for(int i = 0; i < 10; i++) {
        //         System.out.println("Thread 1");
        //     }
        // });

        // Runnable t2 = new Thread(() -> {
        //     for(int i = 0; i < 10; i++) {
        //         System.out.println("Thread 2");
        //     }
        // });

        // Runnable t3 = new Thread(() -> {
        //     for(int i = 0; i < 10; i++) {
        //         System.out.println("Thread 3");
        //     }
        // });

        // Runnable t4 = new Thread(() -> {
        //     for(int i = 0; i < 10; i++) {
        //         System.out.println("Thread 4");
        //     }
        // });

        
        // pool.submit(t1);
        // pool.submit(t2);
        // pool.submit(t3);
        // pool.submit(t4);

        pool.shutdown();
    }
}
