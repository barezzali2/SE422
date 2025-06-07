package Week7.Apr10.Practice;

import java.util.concurrent.CountDownLatch;

public class Hardware implements Runnable{
    private CountDownLatch latch;
    private String name;

    public Hardware(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is preparing");

        try{
            Thread.sleep((long) (Math.random() * 3000)); 
        }catch(Exception ex) {
            System.err.println(ex);
        }

        System.out.println(name + " is ready!");
        latch.countDown();
    }


}
