package Seminar14;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptimalIsPressedUSing {
    public OptimalIsPressedUSing() {
        List<String> wordList = Arrays.asList( "alim", "banana", "tarvas", "arslan", "mori", "baavgai" );
        char startChar = 'a';
        Optional<String> result = wordList.stream()
                .filter(word -> word.contains(String.valueOf(startChar)))
                .findFirst();
        if (result.isPresent()) {
            System.out.println( startChar + " usgiig aguulj bui ehnii ug " + result.get());
        }
        else {
            System.out.println("ugugdsun usgiig aguulsan ug oldsongui " );
        }
    }

    public static void main(String[] args) {
        new OptimalIsPressedUSing();
    }
}
