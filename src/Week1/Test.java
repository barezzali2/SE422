package Week1;


// Recap lecture
public class Test {
    public static void main(String... args) {
        toPrint("Barez", "Ali");
        toPrint("Uni", "AUIS");

    }

    public static void toPrint(String first, String last) {
        System.out.println(first);
        System.out.println(last);

        while(true) {
            // You will be stuck here after the first method call execution
            // Barez
            // Ali
            // Infinite loop!
            // Infinite loop!
            // Infinite loop!
            // Infinite loop!
            // and so on
            System.out.println("Infinite loop!");
            try {
                Thread.sleep(2000);
            } catch(Exception ex) {
                System.err.println(ex);
            }
        }
    }
}
