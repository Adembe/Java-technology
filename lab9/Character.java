package lab9;

public class Character extends Thread{
    private static char currentChar = 'A';
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (Character.class) {
                System.out.print(currentChar);
                currentChar = (char) (currentChar + 1);
                if (currentChar > 'Z') {
                    currentChar = 'A';
                }
            }
        }
    }
}
