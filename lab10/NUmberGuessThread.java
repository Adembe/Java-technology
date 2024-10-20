package lab10;

import java.util.Random;

public class NUmberGuessThread implements Runnable{
    private int threadId;
    private int guessNumber;

    public NUmberGuessThread(int threadId, int guessNumber) {
        this.threadId = threadId;
        this.guessNumber = guessNumber;
    }

    Random random;

    @Override
    public void run() {
        int count=0;
        while (true){
            int number;
            random = new Random();
            number = random.nextInt(100);
            count++;
            if(number == guessNumber){
                System.out.println("Thread " + threadId + ": " + number +
                        "-нь санасан тоо мөн юм. " + count + " удаагийн оролдлогоор таалаа.");
                break;
            }
            else {
                System.out.println("Thread " + threadId + ": " + number +
                        "-нь санасан тоо биш байна. Дахиад тоо авна уу.");
            }
        }
    }
}
