package Seminar9;

public class ThreadSharedCounter {
    public ThreadSharedCounter() {
        SharedCounter number1 = new SharedCounter();
        SharedCounter number2 = new SharedCounter();
        SharedCounter number3 = new SharedCounter();
        SharedCounter number4 = new SharedCounter();
        SharedCounter number5 = new SharedCounter();
        number1.start();
        number2.start();
        number3.start();
        number4.start();
        number5.start();

        try {
            number1.join();
            number2.join();
            number3.join();
            number4.join();
            number5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count : " + number5.getCnt());
    }

    public static void main(String[] args) {
        new ThreadSharedCounter();
    }
}
