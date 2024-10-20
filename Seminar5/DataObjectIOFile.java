package Seminar5;

import java.io.*;
import java.util.Date;

public class DataObjectIOFile {

    ObjectOutputStream outputStream;
    ObjectInputStream inputStream;

    File file = new File("src//Seminar5//object.dat");

    public DataObjectIOFile() throws IOException, ClassNotFoundException {
        output();
        read();
    }

    public void output() throws IOException {
        int[] numbers = {1,2,3,4,5};
        Date date = new Date();
        outputStream = new ObjectOutputStream(new FileOutputStream(file));
        outputStream.writeObject(numbers);
        outputStream.writeObject(date);
        outputStream.close();
    }

    public void read() throws IOException, ClassNotFoundException {
        inputStream = new ObjectInputStream(new FileInputStream(file));
        int[] numbers = (int[])(inputStream.readObject());
        Date readDate = (Date)(inputStream.readObject());
        for (int i=0; i< numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
        System.out.println(readDate);
        inputStream.close();
    }

    public static void main(String[] args) {
        try {
            new DataObjectIOFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
