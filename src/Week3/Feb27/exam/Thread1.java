package Week3.Feb27.exam;

public class Thread1 implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Loop " + i);
        }   
    }
}
