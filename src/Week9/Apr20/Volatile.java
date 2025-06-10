package Week9.Apr20;

import java.util.concurrent.locks.ReentrantLock;

// Homework
// Memory fences in programming, how it is related to volatile

// public class Volatile {
//     // volatile is not lock
//     // is fantastic when it is about visibility, but for threads and locking mechanism, it's not always handy
//     static volatile int count = 0;
//     public static void main(String... args) throws Exception{
//         ReentrantLock lock = new ReentrantLock();
        
//         Runnable task = () -> {
//             try{

//                 lock.lock();
//                 // count = 42;
//                 for(int i = 0; i < 1000000; i++) {
//                     count++;
//                 }
//             }finally {
//                 lock.unlock();
//             }

//         };

//         Thread t1 = new Thread(task);
//         Thread t2 = new Thread(task);

//         t1.start();
//         t2.start();

//         t1.join();
//         t2.join();
//         System.out.println(count);

        
//     }
    
// }







public class Volatile {
    // shared variable
    // adding volatile keyword
    // we are telling JVM to change its behavior, jvm talks to cpu to not rely on caches, caches will not be involved
    // visibility is guaranteed
    static volatile boolean done = false;

    public static void main(String... args) throws Exception{
        Thread t1 = new Thread(() -> {

            // This loop runs until the done value is not true
            while(!done) {
                System.out.println("Thread is running!");
                // System.out.println(done);
            }
            if(done) {
                    System.out.println(done);
                }
            System.out.println("Thread stopped!");
        });

        Thread t2 = new Thread(() -> {

            while(!done) {
                System.out.println(done + " Thread 2");
            }
            System.out.println(done + " Thread 2");

            
        });

        t1.start();
        t2.start();
        
        Thread.sleep(1000);
        
        done = true;
        // This write operation is not visible by the thread
        // The value is gonna be changed in local caches, L1, only visible by core 1 which is main core
        // At the same time, the change will be added to a queue, and it will be located in their provided memory allocation
        // It's called store buffer, and this is good for performance
        System.out.println("Main is done, and the value becomes true " + done);
        t1.join();

    }
}





// public class Volatile {
//     // shared variable
//     static boolean done = false;

//     public static void main(String... args) throws Exception{
//         Thread t1 = new Thread(() -> {

//             // This loop runs until the done value is not true
//             while(!done) {
//                 System.out.println("thread is running...");
//                 System.out.println(done);

//             }
//             System.out.println("Thread stopped!");
//         });

//         t1.start();

//         Thread.sleep(1000);

//         done = true;
//         // This write operation is not visible by the thread
//         // The value is gonna be changed in local caches, L1, only visible by core 1 which is main core
//         // At the same time, the change will be added to a queue, and it will be located in their provided memory allocation
//         // It's called store buffer, and this is good for performance
//         System.out.println("Main is done, and the value becomes true " + done);

//         t1.join();
//     }
// }
