package lab5;

import java.io.*;
import java.util.Random;

public class FileReadDataStream {
    Random random = new Random();
    DataOutputStream outputStream;
    DataInputStream inputStream;
    File file = new File("src//lab5//doubleNumber.dat");


    public FileReadDataStream() throws IOException {
        output();
        readMinNumber();
        evenMinNumber();
        oddMaxNumber();
        maxMinAddNumber();
        firstLastDifferenceNumber();
    }

    public void output() throws IOException {
        outputStream = new DataOutputStream(new FileOutputStream(file));
        for (int i = 0; i<2;i++){
            try {
                outputStream.writeDouble(random.nextDouble());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        outputStream.close();
    }


    public void readMinNumber(){
        double min = Double.POSITIVE_INFINITY;
        double value;
        try {
            inputStream = new DataInputStream(new FileInputStream(file));
            while (inputStream.available()>0){
                value = inputStream.read();
                if(min > value){
                    min = value;
                }
                System.out.println(value);
            }
            System.out.println("min end value : " + min);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void evenMinNumber(){
        double min = Double.POSITIVE_INFINITY;
        double value;
        double index = 0;
        try {
            inputStream = new DataInputStream(new FileInputStream(file));
            while (inputStream.available()>0){
                value = inputStream.read();
                if(index%2 == 0 && min > value){
                    min = value;
                }
                index++;
            }
            System.out.println("even index of min end value : " + min);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void oddMaxNumber(){
        double max = Double.NEGATIVE_INFINITY;
        double value;
        double index = 0;
        try {
            inputStream = new DataInputStream(new FileInputStream(file));
            while (inputStream.available()>0){
                value = inputStream.read();
                if(index%2 == 1 && max < value){
                    max = value;
                }
                index++;
            }
            System.out.println("odd index of module in max end value : " + max);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void maxMinAddNumber(){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        double value;
        double addNumber;
        try {
            inputStream = new DataInputStream(new FileInputStream(file));
            while (inputStream.available()>0){
                value = inputStream.read();
                if(max < value){
                    max = value;
                }
                if(min > value ){
                    min = value;
                }
            }
            addNumber = max + min;
            System.out.println("max + min : "+addNumber);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void firstLastDifferenceNumber(){
        double lastNumber = 0;
        double difference;
        try {
            inputStream = new DataInputStream(new FileInputStream(file));
            double firstNumber = inputStream.read();
            while (inputStream.available()>0){
                lastNumber = inputStream.read();
            }
            difference = lastNumber - firstNumber;
            System.out.println("max - min : " + difference);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            new FileReadDataStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
