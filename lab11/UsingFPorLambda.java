package lab11;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface StringProcessor {
    long processString(String s);
}

public class UsingFPorLambda {

    public UsingFPorLambda() {
        List<String> charStrings = Arrays.asList("Aaaaaa", "eeee", "ooooo", "HhhhhhHh", "Iiiiiii");

        StringProcessor countLowercase = s -> s.chars().filter(Character::isLowerCase).count();

        charStrings.forEach(s -> System.out.println(s + "-iin jijig vsgiin too :" + countLowercase.processString(s)));

        charStrings.stream()
                .skip(1)
                .filter(s -> countLowercase.processString(s) == s.length())
                .forEach(s -> System.out.println("Jijig vsgeer ehelsen vg : " + s));
    }

    public static void main(String[] args) {
        new UsingFPorLambda();
    }
}
