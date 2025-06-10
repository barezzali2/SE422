package Week8.Apr13;

import java.util.concurrent.*;

// public class SyncQueue {
//     public static void main(String[] args) {

//         // Giving flexibility for this queue to hold a specific data type
//         SynchronousQueue<String> queue = new SynchronousQueue<>();

//         // Holding a complex data type
//         SynchronousQueue<Student> queue = new SynchronousQueue<>();
//     }
// }




public class SynchronousQueueExample {
	public static void main(String[] args) {
		// Create a SynchronousQueue
		BlockingQueue<String> queue = new SynchronousQueue<>(); 

		// Producer thread
		Thread producer = new Thread(() -> {
			String[] messages = {"Hello", "World", "From", "SynchronousQueue"};
			try {
				for (String msg : messages) {
					System.out.println("Producing: " + msg);
					queue.put(msg); // Blocks until a consumer takes it
					System.out.println("Produced: " + msg);
				}
				queue.put("DONE"); // Signal the end
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		});

		// Consumer thread
		Thread consumer = new Thread(() -> {
			try {
				String msg;
				while (!(msg = queue.take()).equals("DONE")) {
					System.out.println("Consumed: " + msg);
				}
				System.out.println("Consumer finished.");
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		});

		// Start both threads
		producer.start();
		consumer.start();
	}
}