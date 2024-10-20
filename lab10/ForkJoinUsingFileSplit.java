package lab10;

import java.io.File;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinUsingFileSplit {

    File inputFile = new File("src//lab10//studentFile.bin");
    public ForkJoinUsingFileSplit() {
        int parallelism = Runtime.getRuntime().availableProcessors();
        ForkJoinPool forkJoinPool = new ForkJoinPool(parallelism);
        int start = 0;
        int end = (int) inputFile.length() - 1;
        StudentFileSplit splitFileTask = new StudentFileSplit(inputFile, start, end);
        forkJoinPool.invoke(splitFileTask);
        forkJoinPool.shutdown();
    }

    public static void main(String[] args) {
        new ForkJoinUsingFileSplit();
    }
}
