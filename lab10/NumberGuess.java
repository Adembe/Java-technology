package lab10;

import java.util.Random;

public class NumberGuess {
    Random random;
    public NumberGuess() {
        int quessNumber;
        random = new Random();
        quessNumber = random.nextInt(100);
        System.out.println("Санасан тоо : "+quessNumber);
        Thread thread1 = new Thread(new NUmberGuessThread(1,quessNumber));
        Thread thread2 = new Thread(new NUmberGuessThread(2,quessNumber));
        Thread thread3 = new Thread(new NUmberGuessThread(3,quessNumber));

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static void main(String[] args) {
        new NumberGuess();
    }
}
