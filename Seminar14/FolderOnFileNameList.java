package Seminar14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FolderOnFileNameList {
    public FolderOnFileNameList() {

        String directory = "D:\\Microsoft Office 2013";
        try {
            List<File> files = Files.list(Paths.get(directory))
                    .map(Path::toFile)
                    .filter(File::isFile)
                    .collect(Collectors.toList());

            files.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FolderOnFileNameList();
    }
}
