package Week5.Mar13.Practice;

public class Main {
    public static void main(String... args) {
        BankAcc bankAcc = new BankAcc();

        Thread t1 = new Thread(() -> {
            bankAcc.deposit(50);
            bankAcc.getBalance();
        });
        
        Thread t2 = new Thread(() -> {
            bankAcc.withdraw(40);
            bankAcc.getBalance();
        });

        Thread t3 = new Thread(() -> {
            bankAcc.withdraw(100);
            bankAcc.getBalance();
        });

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(Exception ex) {
            System.err.println(ex);
        }

        // System.out.println("Final " + bankAcc.getBalance());
    }
}
