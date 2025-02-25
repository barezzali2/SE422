package Week3.Feb23;

public class Test {
    public static int counter = 0;
    public static void main(String[] args) throws InterruptedException {
        System.out.println(counter);

        for(int i = 0; i < 1000000; i++) {
            counter++;
            System.out.println(counter);
            
            Thread.sleep(1000);
        }
        
    }
}
