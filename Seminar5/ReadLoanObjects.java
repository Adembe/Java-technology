package Seminar5;

import java.io.*;

public class ReadLoanObjects {
    File file = new File("src//Seminar5//loan.dat");
    ObjectInputStream inputStream;
    ObjectOutputStream outputStream;
    double totalLoanAmount = 0.0;

    public ReadLoanObjects() throws IOException, ClassNotFoundException {
        output();
        read();
    }


    public void output() throws IOException {
        outputStream = new ObjectOutputStream(new FileOutputStream(file));
        Loan obj1 = new Loan(2.5, 12, 250);
        Loan obj2 = new Loan(2.5, 24, 150);
        Loan obj3 = new Loan(2.5, 36, 350);
        outputStream.writeObject(obj1);
        outputStream.writeObject(obj2);
        outputStream.writeObject(obj3);
        outputStream.close();
    }

    public void read() throws IOException, ClassNotFoundException {
        inputStream = new ObjectInputStream(new FileInputStream(file));
        while (inputStream.available()>0){
            Loan loan = (Loan) inputStream.readObject();
            totalLoanAmount += loan.getLoanAmount();
            System.out.println(loan);
        }
        inputStream.close();
    }



    public static void main(String[] args) {
        try {
            new ReadLoanObjects();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
