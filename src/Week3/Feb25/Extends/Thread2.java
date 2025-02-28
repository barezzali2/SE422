package Week3.Feb25.Extends;

public class Thread2 extends Thread{

    @Override
    public void run() {
        while(true) {
            System.out.println("loop 2");
            try {
                Thread.sleep(100);
            }catch(Exception ex) {
                System.err.println(ex);
            }
        }
    }
}
