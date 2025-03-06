package Week4.Mar6;

public class Test {
    public static void main(String... args) {

        SharedCounter counter = new SharedCounter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10000; i++){
                // System.out.println("Thread 1");
                counter.increment();
            }
        });
        
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++){
                // System.out.println("Thread 2");
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join(); // Main thread is waiting for t1 to finish
            t2.join(); // Same, Main goes to sleep mode till they end
            System.out.println("End"); // Main thread will execute this
            System.out.println(counter.getCount());
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}


class SharedCounter {
    private int count = 0;

    public synchronized void increment() { // Intrinsic lock: By using the synchronized keyword, at a time, only one thread can run and execute this method
        count++; // Now it is thread safe
    }

    // In this case, the entire method is not synchronized, only the part that is inside the synch
    public void increment2() { // Intrinsic lock: By using the synchronized keyword, at a time, only one thread can run and execute this method
        synchronized(this) {
            count++; // Now it is thread safe
        }
    }

    public int getCount() {
        return count;
    }
}





// public class Test {
//     public static void main(String... args) {

//         Thread t1 = new Thread(() -> {
//             for(int i = 0; i < 1000; i++){
//                 System.out.println("Thread 1");
//             }
//         });
        
//         Thread t2 = new Thread(() -> {
//             for(int i = 0; i < 1000; i++){
//                 System.out.println("Thread 2");
//             }
//         });

//         t1.start();
//         t2.start();

//         try {
//             t1.join(); // Main thread is waiting for t1 to finish
//             t2.join(); // Same, Main goes to sleep mode till they end
//             System.out.println("End"); // Main thread will execute this
//         }catch(Exception ex) {
//             ex.printStackTrace();
//         }
//     }
// }












// public class Test {
//     public static void main(String... args) {

//         SharedCounter counter = new SharedCounter();

//         Thread t1 = new Thread(() -> {
//             for(int i = 0; i < 10000; i++){
//                 // System.out.println("Thread 1");
//                 counter.increment();
//             }
//         });
        
//         Thread t2 = new Thread(() -> {
//             for(int i = 0; i < 10000; i++){
//                 // System.out.println("Thread 2");
//                 counter.increment();
//             }
//         });

//         t1.start();
//         t2.start();

//         try {
//             t1.join(); // Main thread is waiting for t1 to finish
//             t2.join(); // Same, Main goes to sleep mode till they end
//             System.out.println("End"); // Main thread will execute this
//             System.out.println(counter.getCount());
//         }catch(Exception ex) {
//             ex.printStackTrace();
//         }
//     }
// }


// class SharedCounter {
//     private int count = 0;

//     public void increment() {
//         count++; // This is not thread safe!
//     }

//     public int getCount() {
//         return count;
//     }
// }