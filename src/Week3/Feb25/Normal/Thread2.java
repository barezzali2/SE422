package Week3.Feb25.Normal;

public class Thread2 {

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
