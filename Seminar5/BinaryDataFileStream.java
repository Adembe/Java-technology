package Seminar5;

import java.io.*;
import java.util.Random;

public class BinaryDataFileStream {
    Random random = new Random();
    DataOutputStream outputStream;
    DataInputStream inputStream;
    File file = new File("src//Seminar5//number.dat");


    public BinaryDataFileStream() throws IOException {
        output();
        read();
    }

    public void output() throws IOException {
        outputStream = new DataOutputStream(new FileOutputStream(file));
        for (int i = 0; i<100; i++){
            try {
                outputStream.writeInt(random.nextInt());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        outputStream.close();
    }

    public void read(){
        double sum = 0;
        try {
            inputStream = new DataInputStream(new FileInputStream(file));
            while (inputStream.available()>0){
                sum+=inputStream.read();
            }
            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            new BinaryDataFileStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
