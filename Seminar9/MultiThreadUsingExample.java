package Seminar9;

public class MultiThreadUsingExample {

    public MultiThreadUsingExample() {
        PrintNumbers<Integer> evenNumber = new PrintNumbers<>(20, true);
        PrintNumbers<Integer> oddNumber = new PrintNumbers<>(20,false);
        Thread threadEven = new Thread(evenNumber);
        Thread threadOdd = new Thread(oddNumber);
        threadEven.start();
        threadOdd.start();
    }

    public static void main(String[] args) {
        new MultiThreadUsingExample();
    }
}
