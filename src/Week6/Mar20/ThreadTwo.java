package Week6.Mar20;

public class ThreadTwo extends Thread {
    
    @Override
    public void run() {
        while(true) {
            if(SharedRecource.LOCK2.tryLock()) {
                try{
                    System.out.println("Thread 2: Acquired 2st lock");
                    // This sleep makes the output different
                    try{Thread.sleep(100);}catch(Exception ex) {}
                    
                    if(SharedRecource.LOCK1.tryLock()) {
                        try{
                            System.out.println("Thread 2: Acquired 1st lock");
                            System.out.println("Thread 2: has two locks");
                            return;
                        }finally{
                            SharedRecource.LOCK1.unlock();
                        }
                    }
                }finally{
                    SharedRecource.LOCK2.unlock();
                    System.out.println("Lock 2 released!");
                }
                
            }
        }
            
    }

}





// public class ThreadTwo extends Thread {
    
//     @Override
//     public void run() {
//         try{
//             SharedRecource.LOCK1.lock();
//             System.out.println("Thread 2: Acquired 1st lock");

//             // This sleep makes the output different
//             try{Thread.sleep(100);}catch(Exception ex) {}

//             SharedRecource.LOCK2.lock();
//             System.out.println("Thread 2: Acquired 2st lock");
            
//             System.out.println("Thread 2: has two locks");
//         }finally{
//             SharedRecource.LOCK1.unlock();
//             System.err.println("Thread 2: release lock 1");
//             SharedRecource.LOCK2.unlock();
//             System.err.println("Thread 2: release lock 2");
//         }
//     }
// }