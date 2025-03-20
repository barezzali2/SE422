package Week5.Mar11;

import java.util.concurrent.locks.*;

public class Algo1 {
    ReentrantLock lock = new ReentrantLock();
    int num = 0;

    public void method2() {

        try{
            lock.lock();
            // System.out.println("Print 1");
            num++;
        }
        // catch(Exception ex) {
        //     // We don't need catch for these cases
        // }
        finally {
            // No matter what is going on previously, this will execute
            lock.unlock();
            System.out.println(num);
        }
    }
}






// public class Algo1 {
//     public synchronized void method1() {
//         System.out.println("Method1");

//     }

//     public void method2() {
//         System.out.println("Hello");

//         // This is better
//         // 1. I have more control when to lock and unlock
//         // 2. You have more control to what to lock and unlock
//         // 3. We can pass complex data types, not primitive
//         synchronized(this) {
//             System.out.println("Method2");
//         }

//         // synchronized(Info.id) {
//         //     System.out.println("Method2");
//         // }

//         System.out.println("Bye");
//     }
// }


// class Info {
//     static String id = "590";
// }






// public class Algo1 {
//     public synchronized void method1() {
//         System.out.println("Method1");
//         method2();
//     }

//     public void method2() {
//         synchronized(this) {
//             System.out.println("Method2");
//         }
//     }
// }


// class Info {
//     static String id = "590";
// }









// public class Algo1 {
//     ReentrantLock lock = new ReentrantLock();
//     int result = 0;

//     public void method2() {

//         // Only one thread can execute this line, like synchronized
//         // Other thread will wait till unlock happens
//         // lock() is going to lock the lock pointer, rather than Algo object which was the case in synchronized
//         lock.lock();
//         System.out.println("Method2");
//         for(int i = 1; i <= 10; i++) {
//             result = result + i;
//         }  
//         // We have to call this because this unlock process will not happen automatically like synchronized
//         lock.unlock();

        
//         // lock.lock()
//         // lock.lock()
//         // lock.unlock()
//         // lock.unlock()

//     }


//     public int printResult() {
//         return result;
//     } 
// }