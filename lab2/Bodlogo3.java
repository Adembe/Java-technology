package lab2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bodlogo3 {

    public Bodlogo3() {
    }

    public void textFileIO(){
        String inputFile = "matrix_input.txt";
        String symmetricFile = "symmetric_matrices.txt";
        String otherFile = "other_matrices.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter symmetricWriter = new BufferedWriter(new FileWriter(symmetricFile));
            BufferedWriter otherWriter = new BufferedWriter(new FileWriter(otherFile));

            String line;
            List<List<Integer>> currentMatrix = new ArrayList<>();
            boolean readingMatrix = false;
            boolean checkMatrix = true;

            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    if (readingMatrix) {
                        // Check if the current matrix is symmetric
                        for (int i = 0; i < currentMatrix.size(); i++) {
                            for (int j = 0; j < i; j++) {
                                if (!currentMatrix.get(i).get(j).equals(currentMatrix.get(j).get(i))) {
                                    checkMatrix = false;
                                    break;
                                }
                            }
                            if (!checkMatrix) {
                                break;
                            }
                        }

                        // Write the current matrix to the appropriate file
                        BufferedWriter matrixWriter = checkMatrix ? symmetricWriter : otherWriter;
                        for (List<Integer> row : currentMatrix) {
                            matrixWriter.write(row.toString());
                            matrixWriter.newLine();
                        }
                        matrixWriter.newLine();
                    }

                    // Reset variables for the next matrix
                    currentMatrix.clear();
                    readingMatrix = false;
                    checkMatrix = true;
                } else {
                    if (!readingMatrix) {
                        currentMatrix = new ArrayList<>();
                        readingMatrix = true;
                    }

                    String[] values = line.trim().split("\\s+");
                    List<Integer> row = new ArrayList<>();
                    for (String value : values) {
                        row.add(Integer.parseInt(value));
                    }
                    currentMatrix.add(row);
                }
            }

            reader.close();
            symmetricWriter.close();
            otherWriter.close();

            // Print the contents of the output files to the screen
            System.out.println("Tegsh hemtei Matrices:");
            printFile(symmetricFile);
            System.out.println("\nBusad Matrices:");
            printFile(otherFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void printFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void main(String[] args) {
    }





}
