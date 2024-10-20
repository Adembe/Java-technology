package lab5;

import java.io.*;
import java.nio.Buffer;
import java.util.Random;

public class FileReadByteStream {
    Random random = new Random();
    FileOutputStream outputStream1;
    FileOutputStream outputStream2;
    FileOutputStream outputStream3;
    FileOutputStream outputStream4;
    FileOutputStream outputStream5;
    FileOutputStream outputStreamH;
    FileInputStream inputStream;
    File file1 = new File("src//lab5//file1.dat");
    File file2 = new File("src//lab5//file2.dat");
    File file3 = new File("src//lab5//file3.dat");
    File file4 = new File("src//lab5//file4.dat");
    File file5 = new File("src//lab5//file5.dat");
    File fileH = new File("src//lab5//h.dat");


    public FileReadByteStream() throws IOException {
        output();
        oneFileToThreeFileCopy();
        twoFileToFourFileCopy();
        threeFileToFiveFileCopy();
        fourFileToTwoFileCopy();
        fiveFileToIOneFileCopy();
        readFile1();
        readFile2();
        readFile3();
        readFile4();
        readFile5();
    }




    public void output() throws IOException {
        outputStream1 = new FileOutputStream(file1);
        outputStream2 = new FileOutputStream(file2);
        outputStream3 = new FileOutputStream(file3);
        outputStream4 = new FileOutputStream(file4);
        outputStream5 = new FileOutputStream(file5);
        for (int i = 1; i<=25;i++){
            try {
                if(i >= 1 && i <= 5){
                    outputStream1.write(i);
                }
                else if(i>5 && i<=10){
                    outputStream2.write(i);
                }
                else if(i>10 && i<=15){
                    outputStream3.write(i);
                }
                else if(i>15 && i<=20){
                    outputStream4.write(i);
                }
                else{
                    outputStream5.write(i);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void oneFileToThreeFileCopy() throws IOException {
        outputStream3 = new FileOutputStream(file3,true);
        inputStream = new FileInputStream(file1);
        byte[] bytes  = new byte[4096];
        int value;
        while((value= inputStream.read(bytes)) != -1){
            outputStream3.write(bytes,0,value);
        }
    }

    public void twoFileToFourFileCopy() throws IOException {
        outputStream4 = new FileOutputStream(file4,true);
        inputStream = new FileInputStream(file2);
        int value ;
        while((value= inputStream.read()) != -1){
            outputStream4.write(value);
        }
    }
    public void threeFileToFiveFileCopy() throws IOException {
        outputStream5 = new FileOutputStream(file5,true);
        inputStream = new FileInputStream(file3);
        int value ;
        while((value= inputStream.read()) != -1){
            outputStream5.write(value);
        }
    }
    public void fourFileToTwoFileCopy() throws IOException {
        outputStream2 = new FileOutputStream(file2,true);
        inputStream = new FileInputStream(file4);
        int value ;
        while((value= inputStream.read()) != -1){
            outputStream3.write(value);
        }
    }
    public void fiveFileToIOneFileCopy() throws IOException {
        outputStream1 = new FileOutputStream(file1,true);
        inputStream = new FileInputStream(file5);
        int value ;
        while((value= inputStream.read()) != -1){
            outputStream1.write(value);
        }
    }

    public void readFile1() throws IOException {
        inputStream = new FileInputStream(file1);
        int value ;
        while((value= inputStream.read()) != -1){
            System.out.println("file 1 : " + value);
        }
    }
    public void readFile2() throws IOException {
        inputStream = new FileInputStream(file2);
        int value ;
        while((value= inputStream.read()) != -1){
            System.out.println("file 2 : " + value);
        }
    }
    public void readFile3() throws IOException {
        inputStream = new FileInputStream(file3);
        int value ;
        while((value= inputStream.read()) != -1){
            System.out.println("file 3 : " + value);
        }
    }
    public void readFile4() throws IOException {
        inputStream = new FileInputStream(file4);
        int value ;
        while((value= inputStream.read()) != -1){
            System.out.println("file 4 : " + value);
        }
    }
    public void readFile5() throws IOException {
        inputStream = new FileInputStream(file5);
        int value ;
        while((value= inputStream.read()) != -1){
            System.out.println("file 5 : " + value);
        }
    }

    public static void main(String[] args) {
        try {
            new FileReadByteStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
