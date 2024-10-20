package Seminar7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountKeywords {
    File file;

    public CountKeywords() throws Exception {
        String filename = "src\\Seminar7\\JavaSourceCode.txt";
        file = new File(filename);
        int count = 0;
        if (file.exists()) {
            Map<String, Integer> keywordCount = countKeywords(file);
            for (Map.Entry<String, Integer> entry : keywordCount.entrySet()) {
                if(entry.getValue() != 0)
                {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                    count++;
                }
            }
            System.out.println("Niit Java KeyWords-iin too : "+ count);
        }
        else {
            System.out.println("No File");
        }
    }

    public static Map<String, Integer> countKeywords(File file) throws FileNotFoundException {
        String[] keywordString = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                "const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
                "float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
                "true", "false", "null"};

        Map<String, Integer> keywordCount = new HashMap<>();
        for (String keyword : keywordString) {
            keywordCount.put(keyword, 0);
        }

        Scanner input = new Scanner(file);
        boolean insideComment = false;
        boolean insideString = false;

        while (input.hasNext()) {
            String word = input.next();

            // Check if we are inside a comment
            if (insideComment) {
                if (word.contains("*/")) {
                    insideComment = false;
                }
                continue;
            }

            if (insideString) {
                if (word.contains("\"")) {
                    insideString = false;
                }
                continue;
            }

            if (word.startsWith("//")) {
                continue;
            } else if (word.startsWith("/*")) {
                if (!word.contains("*/")) {
                    insideComment = true;
                }
            } else if (word.startsWith("\"")) {
                if (!word.contains("\"")) {
                    insideString = true;
                }
            } else if (keywordCount.containsKey(word)) {
                keywordCount.put(word, keywordCount.get(word) + 1);
            }
        }

        return keywordCount;
    }

    public static void main(String[] args) throws Exception {
        new CountKeywords();
    }
}
