package Week3.Feb27.exam;

public class Demo {
    public static void main(String... args) {
        

        // We must override and implement the method of Runnable
        // Runnable r = new Runnable() {
        //     public void run() {

        //     }
        // };



        // Runnable r = () -> {
        //         for(int i = 0; i < 10; i++) {
        //             System.out.println("Loop" + i);
        //         }
        //     };
        // new Thread(r).start();
        


        // Thread t1 = new Thread(() -> {
        //     for(int i = 0; i < 10; i++) {
        //         System.out.println("Loop" + i);
        //     }   
        // });
        // t1.start();

        // Thread t2 = new Thread(() -> {
        //     for(int i = 0; i < 10; i++) {
        //         System.out.println("Loop" + i);
        //     }   
        // });
        // t2.start();


        // Thread1 t1 = new Thread1();
        // Thread th = new Thread(t1);
        // th.start();
        // new Thread(new Thread1()).start();
        


        // Thread t1 = new Thread() {
        //     public void run() {
        //         for(int i = 0; i < 10; i++) {
        //             System.out.println("Loop 1 " + i);
        //             try{
        //                 Thread.sleep(500);
        //             }catch(Exception ex ){
        //                 System.err.println(ex);
        //             }
        //         } 

        //     }
        // };

        // Thread t2 = new Thread() {
        //     public void run() {
        //         for(int i = 0; i < 10; i++) {
        //             System.out.println("Loop 2 " + i);
        //             try{
        //                 Thread.sleep(500);
        //             }catch(Exception ex ){
        //                 System.err.println(ex);
        //             }
        //         } 

        //     }
        // };


        // t1.start();
        // t2.start();
    }
}
