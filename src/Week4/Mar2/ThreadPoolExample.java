package Week4.Mar2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String... args) {
        // Solution for the number of threads and cores
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);
        ExecutorService pool = Executors.newFixedThreadPool(processors+1); // The max # of threads that this pool is going to use
        // ExecutorService pool = Executors.newFixedThreadPool(3); // The max # of threads that this pool is going to use
        // 1.
        Runnable task1 = () -> {
            for(int i = 0; i < 100; i++) {
                System.out.println("AUIS");    
            }
        };

        pool.execute(task1);
    }
}


// Runtime is a class in Java that is responsible of talking and communicating with OS to do some operations, through JVM this will be done.
// availableProcessors() is a method that returns an integer which is the number of cores available in the OS CPU