package Week6.Mar18.Practice;

public class Main {
    public static void main(String... args) {
        Inventory inv = new Inventory();

        Thread t1 = new Thread(() -> {
            inv.addItem(90);
            System.out.println(inv.getItems());
        });

        Thread t2 = new Thread(() -> {
            inv.removeItem(20);
            System.out.println(inv.getItems());
        });
        
        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        }catch(Exception ex) {
            System.err.println(ex);
        }
        System.out.println(inv.getItems());
    }
}
