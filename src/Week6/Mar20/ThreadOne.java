package Week6.Mar20;

public class ThreadOne extends Thread {
    
    @Override
    public void run() {
        while(true) {

            if(SharedRecource.LOCK1.tryLock()) {
                try{
                    System.out.println("Thread 1: Acquired 1st lock");
                    // This sleep makes the output different
                    try{Thread.sleep(100);}catch(Exception ex) {}
                    
                    if(SharedRecource.LOCK2.tryLock()) {
                        try{
                            System.out.println("Thread 1: Acquired 2st lock");
                            System.out.println("Thread 1: has two locks");
                            return;
                        }finally{
                            SharedRecource.LOCK2.unlock();
                        }
                    }
                }finally{
                    SharedRecource.LOCK1.unlock();
                    System.out.println("Lock 1 released!");
                }
                
            }
        }
          
    }
}




// public class ThreadOne extends Thread {
    
//     @Override
//     public void run() {
//         try{
//             SharedRecource.LOCK1.lock();
//             System.out.println("Thread 1: Acquired 1st lock");

//             try{Thread.sleep(100);}catch(Exception ex) {}

//             SharedRecource.LOCK2.lock();
//             System.out.println("Thread 1: Acquired 2st lock");

//             System.out.println("Thread 1: has two locks");
//         }finally{
//             SharedRecource.LOCK1.unlock();
//             System.err.println("Thread 1: release lock 1");
//             SharedRecource.LOCK2.unlock();
//             System.err.println("Thread 1:release lock 2");
//         }
//     }
// }