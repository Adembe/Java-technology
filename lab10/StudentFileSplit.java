package lab10;

import java.io.*;
import java.util.concurrent.RecursiveTask;

public class StudentFileSplit extends RecursiveTask {
    private final static int THRESHOLD = 1024;
    byte[] list;
    private File inputFile;
    private int low;
    private int high;
    RandomAccessFile randomAccessFile ;
    FileOutputStream fileOutputStream ;

    public StudentFileSplit(File inputFile, int low, int high) {
        this.inputFile = inputFile;
        this.low = low;
        this.high = high;
    }

    @Override
    protected Object compute() {
        try {
            randomAccessFile = new RandomAccessFile(inputFile,"r");
            list = new byte[THRESHOLD];
            randomAccessFile.seek(low);

            int splitBytesRead = randomAccessFile.read(list,0,THRESHOLD);
            while (splitBytesRead!=-1 && randomAccessFile.getFilePointer()<=high){
                String splitFileName = "src//lab10//"+low+"_"+high+"splitFile.bin";
                fileOutputStream = new FileOutputStream(splitFileName);
                fileOutputStream.write(list,0,splitBytesRead);
                low+=THRESHOLD;
                randomAccessFile.seek(low);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
