package lab9;

import java.io.*;
import java.util.Random;

public class ObjectStreamAndThreadUsing extends Thread{

    Massive[] massive = new Massive[4];
    Thread[] thread = new Thread[4];
    int[] inputMassiveData = new int[5];
    File[] files = new File[4];

    File file1 = new File("src//lab9//massive1.bin");
    File file2 = new File("src//lab9//massive2.bin");
    File file3 = new File("src//lab9//massive3.bin");
    File file4 = new File("src//lab9//massive4.bin");
    String[] binaryFileName = {"massive1.bin","massive2.bin","massive3.bin","massive4.bin"};

    ObjectInputStream inputStream;
    Random random = new Random();
    public ObjectStreamAndThreadUsing() throws IOException, ClassNotFoundException {
        files[1] = file1;
        files[2] = file2;
        files[3] = file3;
        files[4] = file4;
        MassiveDataWriteBinary();
        ReadMassiveData();
    }

    public void MassiveDataWriteBinary() throws IOException {
        for(int i=0; i<5; i++){
            inputMassiveData[i] = random.nextInt(100);
        }
        for (int i=0; i<4;i++){
            massive[i] = new Massive(inputMassiveData,binaryFileName[i]);
            thread[i] = new Thread(massive[i]);
            thread[i].start();
        }
        for(int i = 0; i < 4; i++) {
            try {
                thread[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Massive massive1 = massive[i];
            System.out.println((i + 1) + "-r massive-iin :");
            System.out.println("Max : " + massive1.getMax());
            System.out.println("Min : " + massive1.getMin());
        }

    }


    public void ReadMassiveData() throws IOException{
        int index=0;
        for (int i=0; i<4; i++){
            int sum = 0;
            inputStream = new ObjectInputStream(new FileInputStream(binaryFileName[i]));
            try{
                while (inputStream.available() > 0){
                    int massiveData = inputStream.readInt();
                    System.out.println(i+"-r massive-iin" +index+ "-r utga"+massiveData);
                    index++;
                    sum +=massiveData;
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            System.out.println(i+"-r massive-iin niilber: "+sum);
        }
    }

    public static void main(String[] args) {
        try {
            new ObjectStreamAndThreadUsing();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
