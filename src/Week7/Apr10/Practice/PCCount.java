package Week7.Apr10.Practice;

import java.util.concurrent.CountDownLatch;

public class PCCount {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Thread t1 = new Thread(new Hardware(latch, "CPU"));
        Thread t2 = new Thread(new Hardware(latch, "Memory"));
        Thread t3 = new Thread(new Hardware(latch, "Motherboard"));

        Thread t4 = new Thread(new Boot(latch));
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
    
}
