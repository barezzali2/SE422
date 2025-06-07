package Week7.Apr10;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3); // countdown starts at 3

		new Thread(new Launcher(latch)).start();

		// Worker threads
		new Thread(new Worker(latch, "Fuel System")).start();
		new Thread(new Worker(latch, "Navigation System")).start();
		new Thread(new Worker(latch, "Weather Check")).start();

	}
}

class Worker implements Runnable {
	private CountDownLatch latch;
	private String name;

	public Worker(CountDownLatch latch, String name) {
		this.latch = latch;
		this.name = name;
	}

	public void run() {
		System.out.println(name + " is preparing...");
		try {
			Thread.sleep((long) (Math.random() * 3000)); // Simulate work
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " is ready!");
		latch.countDown(); // Decrease the count
	}
}

class Launcher implements Runnable {
	private CountDownLatch latch;

	public Launcher(CountDownLatch latch) {
		this.latch = latch;
	}

	public void run(){
		try {
			System.out.println("Main thread waiting for systems to be ready...");
			latch.await(); // Waits until the count reaches 0
			System.out.println("All systems ready. Launching rocket!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}