package Week9.Apr22;
import java.util.concurrent.atomic.*;

// Check doc for other methods

public class AtomicEx {
    public static void main(String... args) {
        
        AtomicInteger count = new AtomicInteger(0);

        int newValue = count.addAndGet(5);
        System.out.println(newValue);


        for(int i = 0; i < 1000; i++) {
            new Thread(() -> {
                if(count.get() == 0) {
                    // This is not thread-safe because there is no guaraantee that at this point the original value is 0 because other threads may intervene
                    // count.set(1);


                    // This will be the solution
                    boolean value = count.compareAndSet(0, 1);
                    System.out.println(value);
                }
            }).start();
        }

        try{
            Thread.sleep(500);
        }catch(Exception ex) {
            System.err.println(ex);
        }

        System.out.println(count.get());
    }
}





// public class AtomicExample {
// 	private static AtomicInteger count = new AtomicInteger(0);

// 	public static void main(String[] args) {
// 		for (int i = 0; i < 1000; i++) {
// 			new Thread(() -> {
// 				count.incrementAndGet();
// 			}).start();
// 		}

// 		// Wait a bit for all threads to finish (simplified)
// 		try { Thread.sleep(1000); } catch (InterruptedException e) {}

// 		System.out.println("Final count: " + count.get());
// 	}
// }



// public class AtomicEx {
//     public static void main(String... args) {
        
//         AtomicInteger count = new AtomicInteger(0);

//         for(int i = 0; i < 1000; i++) {
//             new Thread(() -> {
//                 // This is different, the operation of the threads are concurrent and parallel, some of them can run in parallel and increment the value, it was not the case in locks.
//                 count.incrementAndGet(); // This is a thread-safe operation, it is much better in performance compared to locks
//             }).start();

//             new Thread(() -> {
//                 // This is different, the operation of the threads are concurrent and parallel, some of them can run in parallel and increment the value, it was not the case in locks.
//                 count.incrementAndGet(); // This is a thread-safe operation, it is much better in performance compared to locks
//             }).start();
//         }

//         try{
//             Thread.sleep(500);
//         }catch(Exception ex) {
//             System.err.println(ex);
//         }

//         System.out.println(count.get());

//         // int result1 = count.getAndIncrement(); // Equivalent to count++

//         // int result2 = count.incrementAndGet(); // Equivalent to ++count


//     // This is internally the way that this method is gonna execute and done, the method itself
//     // public final int incrementAndGet() {
//     //     int prev, next;

//     //     do{
//     //         prev = get(); // get the value
//     //         next = prev + 1; // increment
//     //     }while(!compareAndSet(prev, next)); // retry until successful
//     //     return next;
//     // }

//     }
// }




// public class AtomicEx {
//     public static void main(String... args) {
        
//         AtomicInteger count = new AtomicInteger(0);

//         int result1 = count.getAndIncrement(); // Equivalent to count++

//         int result2 = count.incrementAndGet(); // Equivalent to ++count

//         System.out.println(result1);
//         System.out.println(result2);

//         // Check doc for other methods
        
//     }
// }
