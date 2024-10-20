package Seminar14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNameUsingStream {
    public SortNameUsingStream() {
        List<String> names= Arrays.asList("bat","bold","suvdaa","oyu");
        names.stream().sorted().collect(Collectors.toList());
        System.out.println("Names Sorted : " + names);
    }

    public static void main(String[] args) {
        new SortNameUsingStream();
    }
}
