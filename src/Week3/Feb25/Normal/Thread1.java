package Week3.Feb25.Normal;

public class Thread1 {
    
    public void run() {
        while(true) {
            System.out.println("loop 1");
            try {
                Thread.sleep(100);
            }catch(Exception ex) {
                System.err.println(ex);
            }
        }
    }
}
