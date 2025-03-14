package Week3.Feb27.Practice;

public class Demoo {
    public static void main(String... args) {

        System.out.println("Thread starts");

        

        System.out.println("Thread ends");

    }
}



// // LoopThread1 t1 = new LoopThread1();
//         // LoopThread2 t2 = new LoopThread2();
//         Thread t1 = new LoopThread1();
//         Thread t2 = new LoopThread2();
//         t1.start();
//         t2.start();





// LoopThread1 t1 = new LoopThread1();
//         LoopThread2 t2 = new LoopThread2();
//         Thread th1 = new Thread(t1);
//         Thread th2 = new Thread(t2);
//         th1.start();
//         th2.start();

// Runnable t1 = new LoopThread1();
//         Runnable t2 = new LoopThread2();
//         Thread th1 = new Thread(t1);
//         Thread th2 = new Thread(t2);
//         th1.start();
//         th2.start();




// Thread t1 = new LoopThread1() {
//     @Override
//     public void run() {
//         for(int i = 0; i < 100; i++) {
//             System.out.println("Thread 1");

//             try {
//                 Thread.sleep(500);
//             }catch(Exception ex) {

//             }
//         }
//     }
// };

// t1.start();



// Runnable r = new Runnable() {
//     @Override
//     public void run() {
//         for(int i = 0; i < 10; i++) {
//             System.out.println("Loop" + i);
//         }
//     }
// };
// Thread t = new Thread(r);
// t.start();




// Runnable r = () -> {
//     for(int i = 0; i < 10; i++) {
//         System.out.println("Loop" + i);
//     }
// };

// new Thread(r).start();