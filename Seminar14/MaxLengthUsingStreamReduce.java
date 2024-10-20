package Seminar14;

import java.util.Arrays;
import java.util.List;

public class MaxLengthUsingStreamReduce {
    public MaxLengthUsingStreamReduce() {
        List<String> names= Arrays.asList("bat","bold","suvdaa","oyu");
        String maxLengthWord = names.stream().reduce((a,b)->a.length() > b.length() ? a : b).orElse("");
        System.out.println("Hamgiin urt vg : "+ maxLengthWord);
    }

    public static void main(String[] args) {
        new MaxLengthUsingStreamReduce();
    }
}
