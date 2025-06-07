package Week7.Apr8;



public class WaitNotifyExample {
	public static void main(String[] args) {
		SharedResource resource = new SharedResource();

		Thread producer = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				resource.produce();
			}
		});

		Thread consumer = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				resource.consume();
			}
		});


		producer.start();
		consumer.start();
	}
}



class SharedResource {
	private boolean available = false;

	public synchronized void produce() {
		while (available) {
			try {
				wait(); // wait if already produced
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Produced");
		available = true;
		notify(); // notify one waiting thread
	}

	public synchronized void consume() {
		while (!available) {
			try {
				wait(); // wait until something is produced
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Consumed");
		available = false;
		notify(); // notify one waiting thread
	}
}
