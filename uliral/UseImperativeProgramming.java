package uliral;

import java.io.File;
import java.util.Scanner;

public class UseImperativeProgramming {
    public UseImperativeProgramming() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Aguulj bui Folder iin zamiig oruulna uu : ");
            String folderPath = scanner.nextLine();
            File countFolder = new File(folderPath);
            if (countFolder.exists() && countFolder.isDirectory()) {
                int[] resultFolderAndFileCount = countFoldersAndFiles(countFolder);
                System.out.println("Aguulagdaj bui Folder iin too : " + resultFolderAndFileCount[0]);
                System.out.println("Aguulagdaj bui file iin too : " + resultFolderAndFileCount[1]);
            } else {
                System.out.println("Ug zam deer folder oldsongvi !!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] countFoldersAndFiles(File folder) {
        int countFolder = 0, countFile = 0;
        try {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        countFolder++;
                        int[] folderOnFolderCounts = countFoldersAndFiles(file);
                        countFolder += folderOnFolderCounts[0];
                        countFile += folderOnFolderCounts[1];
                    } else {
                        countFile++;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new int[]{countFolder, countFile};
    }
    public static void main(String[] args) {
        new UseImperativeProgramming();
    }
}
