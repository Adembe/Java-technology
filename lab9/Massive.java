package lab9;

import java.io.*;

class Massive extends Thread {
    DataOutputStream outputStream;
    private int[] array;
    private int max;
    private int min;
    private String fileName;

    public Massive(int[] array, String fileName) {
        this.array = array;
        this.fileName = fileName;
    }

    public void run() {
        max = array[0];
        min = array[0];
        for (int value : array) {
            max = Math.max(max, value);
            min = Math.min(min, value);
        }
        try {
            outputStream = new DataOutputStream(new FileOutputStream(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            for (int value : array) {
                outputStream.writeInt(value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
