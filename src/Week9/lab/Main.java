package Week9.lab;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        AtomicLong count = new AtomicLong();

        for(int i = 0; i < 5; i++) {
            new Thread(() -> {
                for(int j = 0; j < 1000; j++) {
                    count.incrementAndGet();
                }
            }).start();
        }

        try{Thread.sleep(1000);
        }catch(Exception ex) {System.err.println(ex);}

        System.out.println(count.get());
    }
}
