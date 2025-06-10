package Week8.Apr15;

import java.util.concurrent.*;

// public class CustomThreadPool {
//     public static void main(String[] args) {
         
//         // They should be integer, and non-negative number
//         // The idea of using the linkedblockingqueue is intentional. It can slow down the producers that add task to the queue in order to help the threads to be able to get the tasks
//         ExecutorService customPool = new ThreadPoolExecutor(4, 10, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(20));


//         // This custom queue is more aggresive to create new threads, its constructor does not accept any number
//         ExecutorService customPool2 = new ThreadPoolExecutor(4, 10, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());


//         // Fixed thread pool
//         ExecutorService customPool3 = new ThreadPoolExecutor(10, 10, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());


//         // 
//         ExecutorService customPool4 = new ThreadPoolExecutor(0, 10, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());

        
//         // idle means there is not any task that a thread executes, or it is essentially waiting for a task to be assigned to it from the queue
//     }
// }



 public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with a SynchronousQueue
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
            0, // Core pool size
            10, // Maximum pool size
            60L, // Keep-alive time
            TimeUnit.SECONDS, // Time unit for keep-alive
            new SynchronousQueue<Runnable>() // SynchronousQueue for direct handoff
        );

        // Submit tasks to the executor
        for (int i = 1; i <= 5; i++) {
            final int taskNumber = i;
            executor.execute(() -> {
                System.out.println("Executing Task " + taskNumber + " by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // Simulate task execution
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // Shutdown the executor
        executor.shutdown();
    }
}