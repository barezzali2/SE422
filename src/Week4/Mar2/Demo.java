package Week4.Mar2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String... args) {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println(processors);

        ExecutorService pool = Executors.newFixedThreadPool(processors+1);

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                System.out.println("Thread 1 " + i);

                try{
                    Thread.sleep(500);
                }catch(Exception ex) {
                    System.err.println(ex);
                }
            }
        });


        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                System.out.println("Thread 2 " + i);

                try{
                    Thread.sleep(500);
                }catch(Exception ex) {
                    System.err.println(ex);
                }
            }
        });


        Thread t3 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                System.out.println("Thread 3 " + i);

                try{
                    Thread.sleep(500);
                }catch(Exception ex) {
                    System.err.println(ex);
                }
            }
        });


        Thread t4 = new Thread(() -> {
            for(int i = 0; i < 100; i++) {
                System.out.println("Thread 4 " + i);

                try{
                    Thread.sleep(500);
                }catch(Exception ex) {
                    System.err.println(ex);
                }
            }
        });


        // t1.start();
        // t2.start();
        // t3.start();
        // t4.start();

        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);

        pool.shutdown();


    }
}
