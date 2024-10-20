package Seminar9;

public class PrintNumbers<T extends Number> implements Runnable{
    private T number;
    private boolean isOdd;

    public PrintNumbers(T number, boolean isOdd) {
        this.number = number;
        this.isOdd = isOdd;
    }

    @Override
    public void run() {
        int start = isOdd ? 1 : 0;
        for (int i = start; i <= number.intValue(); i += 2) {
            String type = isOdd ? "Odd" : "Even";
            System.out.println(type + " Number : " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
