package seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextInputWrite {

    File inputFile, outFile;

    public TextInputWrite() throws FileNotFoundException {
        inputFile = new File("src\\input.txt");
        outFile = new File("src\\output.txt");
        FileInputOutput(inputFile,outFile);
    }

    public void FileInputOutput(File inputfile,File outputfile) throws FileNotFoundException {
        Scanner input = new Scanner(inputfile);
        PrintWriter writer = new PrintWriter(outputfile);
        while (input.hasNext()){
            int temp = input.nextInt();
            if(temp >= 0){
                temp = (int) Math.pow(temp,2);
            }
            else {
                temp = Math.abs(temp);
            }
            writer.print(temp+ " ");
        }
        input.close();
        writer.close();
    }


    public static void main(String[] args) {
        try {
            new TextInputWrite();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}