package Seminar14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JoinUsing {
    public JoinUsing() {
        List<String> names= Arrays.asList("bat","bold","suvdaa","oyu");
        Optional<String> combinedWords = Optional.ofNullable(
                names.stream()
                        .collect(Collectors.joining()));
        System.out.println("Combined words: " + combinedWords);
    }

    public static void main(String[] args) {
        new JoinUsing();
    }
}
