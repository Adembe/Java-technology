package Seminar9;

public class MassiveElementSumUsingThread {
    private static int threadsNumber = 4;
    private static int[] intNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
    private int sum=0;
    public MassiveElementSumUsingThread() {
        Thread[] threads = new Thread[threadsNumber];
        int divideIndex = intNumbers.length/threadsNumber;
        for (int i = 0; i < threadsNumber; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                int partialSum = 0;
                int startIndex = threadIndex * divideIndex;
                int endIndex;
                if (threadIndex == threadsNumber - 1) {
                    endIndex = intNumbers.length;
                } else {
                    endIndex = startIndex + divideIndex;
                }
                for (int j = startIndex; j < endIndex; j++) {
                    partialSum += intNumbers[j];
                }
                sum=sum+partialSum;
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
        System.out.println("Massive sum: " + sum);
    }

    public static void main(String[] args) {
        new MassiveElementSumUsingThread();
    }
}
