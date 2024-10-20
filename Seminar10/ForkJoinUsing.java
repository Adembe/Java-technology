package Seminar10;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinUsing {
    final int N = 9000000;
    int[] list = new int[N];

    public ForkJoinUsing() {
        for (int i = 0; i < list.length; i++){
            list[i]=1;
        }
        long startTime = System.currentTimeMillis();
        System.out.println("\nThe Sum number is " + sum(list));
        long endTime = System.currentTimeMillis();
        System.out.println("The number of processors is " +Runtime.getRuntime().availableProcessors());
        long doneTime = endTime-startTime;
        System.out.println("Time is " + doneTime + " milliseconds");
    }

    public static int sum(int[] list){
        RecursiveTask<Integer> task = new ParallelSum(list, 0, list.length);
        ForkJoinPool pool = new ForkJoinPool();
        return pool.invoke(task);
    }

    public static void main(String[] args) {
        new ForkJoinUsing();
    }
}
