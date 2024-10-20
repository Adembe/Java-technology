package Seminar9;

import java.util.concurrent.atomic.AtomicLong;

public class ElementSumMultiThread {
    private static final int NUM_THREADS = 4;
    private static final long[] elements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Replace with your array of elements
    private static AtomicLong totalSum = new AtomicLong(0);

    public static void main(String[] args) {
        Thread[] threads = new Thread[NUM_THREADS];
        int chunkSize = elements.length / NUM_THREADS;

        for (int i = 0; i < NUM_THREADS; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                long partialSum = 0;
                int start = threadIndex * chunkSize;
                int end = (threadIndex == NUM_THREADS - 1) ? elements.length : start + chunkSize;
                for (int j = start; j < end; j++) {
                    partialSum += elements[j];
                }
                totalSum.addAndGet(partialSum);
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total sum: " + totalSum.get());
    }
}

