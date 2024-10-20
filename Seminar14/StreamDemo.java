package Seminar14;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public StreamDemo() {
        List<String> names= Arrays.asList("bat","bold","suvdaa","oyu");
        names.stream() .map(String::toUpperCase) .forEach(System.out::println);
        int charsLen= names.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(charsLen);
    }

    public static void main(String[] args) {
        new StreamDemo();
    }
}
