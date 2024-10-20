package lab5;

import lab4.ArrayClass;

import java.io.*;
import java.util.*;

public class FileReadObjectStream {
    ObjectOutputStream outputStream;
    ObjectInputStream inputStream;

    File file = new File("src//lab5//cube.bin");

    public FileReadObjectStream() throws IOException, ClassNotFoundException {
        output();
        maxColorCubeCount();
        MSizeWoodCubeCount();
    }

    public void output() throws IOException {
        List<Cube> cubeList = new ArrayList<>();
        outputStream = new ObjectOutputStream(new FileOutputStream(file));
        cubeList.add(new Cube(2,"green","wood"));
        cubeList.add(new Cube(3,"blue","cardboard"));
        cubeList.add(new Cube(4,"red","wood"));
        cubeList.add(new Cube(2,"white","iron"));
        cubeList.add(new Cube(3,"red","wood"));
        cubeList.add(new Cube(2,"yellow","wood"));
        for (Cube cube : cubeList){
            outputStream.writeObject(cube);
        }
        outputStream.close();
    }

    public void maxColorCubeCount() throws IOException, ClassNotFoundException {
        int countGreen=0,countRed=0,countBlue=0,countYellow=0;
        inputStream = new ObjectInputStream(new FileInputStream(file));
        int woodenCount = 0;
        Map<String, Integer> colorCount = new HashMap<>();
        while (true) {
            try {
                Cube cube = (Cube) inputStream.readObject();
                switch (cube.getColor()){
                    case "green":
                        countGreen++;
                        break;
                    case "red":
                        countRed++;
                        break;
                    case "blue":
                        countBlue++;
                        break;
                    case "yellow":
                        countYellow++;
                        break;
                }
                colorCount.put(cube.getColor(), colorCount.getOrDefault(cube.getColor(), 0) + 1);
                System.out.println(cube);
            } catch (EOFException e) {
                break;
            }
        }
        inputStream.close();
        System.out.println("Хөх өнгийн шоо : "+ countBlue);
        System.out.println("Улаан өнгийн шоо : "+ countRed);
        System.out.println("Шар өнгийн шоо : "+ countYellow);
        System.out.println("Ногоон өнгийн шоо : "+ countGreen);

        int maxCount = 0;
        String mostColor = null;
        for (Map.Entry<String, Integer> entry : colorCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostColor = entry.getKey();
            }
        }
        System.out.println("Хамгийн их давхацсан өнгийн шоо : " + mostColor);
    }

    public void MSizeWoodCubeCount() throws IOException ,ClassNotFoundException{
        inputStream = new ObjectInputStream(new FileInputStream(file));
        double M = 2;
        int count = 0;
        while (true) {
            try {
                Cube cube = (Cube) inputStream.readObject();
                if (cube.getMaterial().equalsIgnoreCase("wood") && cube.getLength() == M) {
                    count++;
                }
            } catch (EOFException e) {
                break;
            }
        }
        System.out.println(M + " иртэгтэй модон шоо : "+count);
        inputStream.close();
    }

    public static void main(String[] args) {
        try {
            new FileReadObjectStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
