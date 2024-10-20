package Seminar10;

import java.util.concurrent.RecursiveTask;

public class ParallelSum extends RecursiveTask<Integer> {
    private final static int THRESHOLD = 1000;
    private int[] list;
    private int low;

    private int high;
    public ParallelSum(int[] list, int low, int high) {
        this.list = list;
        this.low = low;
        this.high = high;
    }


    @Override
    protected Integer compute() {
        if(high-low<THRESHOLD){
            int sum=0;
            for (int i = low; i < high; i++){
                sum=sum+list[i];
            }
            return sum;
        }
        else {
            int mid = (low + high) / 2;
            RecursiveTask<Integer> left = new ParallelSum(list, low, mid);
            RecursiveTask<Integer> right = new ParallelSum(list, mid, high);
            left.fork();
            right.fork();
            return (left.join().intValue()+right.join().intValue());
        }
    }
}
