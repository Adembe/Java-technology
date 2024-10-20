package seminar2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class StudentWrite {

    File inputFile, outFile;
    ArrayList<Integer> List = new ArrayList<>();
    PrintWriter avPut = new PrintWriter("src\\Average.txt");

    int sum = 0;
    double average;

    public StudentWrite() throws FileNotFoundException {
        inputFile = new File("src\\inputStudent.txt");
        outFile = new File("src\\outputStudent.txt");
        FileInputOutput(inputFile,outFile);
    }

    public void FileInputOutput(File inputfile,File outputfile) throws FileNotFoundException {
        Scanner input = new Scanner(inputfile);
        PrintWriter writer = new PrintWriter(outputfile);
        while (input.hasNext()){
            String firstName = input.next();
            String lastName = input.next();
            int temp = input.nextInt();
            if(temp >= 3){
                writer.println(firstName +" "+lastName+" "+temp);
            }
            else {
                List.add(temp);
            }
        }
        for (int i=0;i<List.size();i++){
            out.printf("List %d elementiin utga %d ",i,List.get(i));
            sum = sum + List.get(i);
        }
        out.printf("sum : %d",sum);
        average = sum/List.size();
        avPut.print(average);
        input.close();
        writer.close();
        avPut.close();
    }



    public static void main(String[] args) {
        try {
            new StudentWrite();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
