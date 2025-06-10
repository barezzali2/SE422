package Week9.Apr24;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Benchmark {
	private static final int THREADS = 100;
	private static final int INCREMENTS_PER_THREAD = 100_000;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting benchmark...\n");

		long atomicTime = benchmarkAtomicLong();
		long longAdderTime = benchmarkLongAdder();

		System.out.printf("AtomicLong time: %d ms%n", atomicTime);
		System.out.printf("LongAdder time: %d ms%n", longAdderTime);
	}

	static long benchmarkAtomicLong() throws InterruptedException {
		AtomicLong counter = new AtomicLong();
		ExecutorService executor = Executors.newFixedThreadPool(THREADS);

		long start = System.nanoTime();
		for (int i = 0; i < THREADS; i++) {
			executor.execute(() -> {
				for (int j = 0; j < INCREMENTS_PER_THREAD; j++) {
					counter.incrementAndGet();
				}
			});
		}

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);
		long end = System.nanoTime();

		System.out.println("AtomicLong final value: " + counter.get());
		return (end - start) / 1_000_000; // ms
	}

	static long benchmarkLongAdder() throws InterruptedException {
		LongAdder counter = new LongAdder();
		ExecutorService executor = Executors.newFixedThreadPool(THREADS);

		long start = System.nanoTime();
		for (int i = 0; i < THREADS; i++) {
			executor.execute(() -> {
				for (int j = 0; j < INCREMENTS_PER_THREAD; j++) {
					counter.increment();
				}
			});
		}

		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);
		long end = System.nanoTime();

		System.out.println("LongAdder final value: " + counter.sum());
		return (end - start) / 1_000_000; // ms
	}
}