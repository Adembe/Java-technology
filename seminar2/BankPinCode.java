package seminar2;

import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.PrintWriter;
    import java.util.Scanner;
    
    import static java.lang.System.out;
    
    public class BankPinCode {
    
    
        File inputFile, outFile;
        int count=0;
    
        public BankPinCode() throws FileNotFoundException {
            inputFile = new File("src\\BankPin.txt");
            outFile = new File("src\\NoErrorPinCode.txt");
            FileInputOutput(inputFile,outFile);
        }
    
        public void FileInputOutput(File inputfile,File outputfile) throws FileNotFoundException {
            Scanner input = new Scanner(inputfile);
            PrintWriter writer = new PrintWriter(outputfile);
            while (input.hasNext()){
                int temp = input.nextInt();
                String str = String.valueOf(temp);
                int i = 0;
                out.printf("str : %s\n",str);
                while (i<str.length()-1){
                    char digit1 = str.charAt(i);
                    char digit2 = str.charAt(i+1);
                    int numericValue1 = Character.getNumericValue(digit1);
                    int numericValue2 = Character.getNumericValue(digit2);
                    out.printf("num1 : %d\n",numericValue1);
                    out.printf("num2 : %d\n",numericValue2);
                    if (numericValue2 > str.length())
                    {
                        if(numericValue1 == numericValue2){
                            count++;
                        }
                    }
                    i++;
                }
                if(count!=1){
                    writer.println(temp);
                }
            }
            input.close();
            writer.close();
        }
    
    
    
        public static void main(String[] args) {
            try {
                new BankPinCode();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
