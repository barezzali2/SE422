package Week7.Apr10.Practice;

import java.util.concurrent.CountDownLatch;

public class Boot implements Runnable{
    private CountDownLatch latch;

    public Boot(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try{
        System.out.println("The system is waiting for the preperations...");
        latch.await();
        System.out.println("The system is ready!");
        }catch(Exception ex) {
            System.err.println(ex);
        }
    }
    
}
