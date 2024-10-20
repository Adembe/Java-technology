package Seminar14;

import java.util.Optional;
import java.util.OptionalInt;

public class CharInWordUsingOptional {
    public CharInWordUsingOptional() {
        String input = "l23o53ve";

        OptionalInt sum = input.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .reduce((a,b)-> a*10+b);

        sum.ifPresentOrElse(
                value -> System.out.println("Temdegt moriin toonuudiin niilber: " + value),
                () -> System.out.println("Temdegt morond too baihgvi baina.")
        );

    }

    public static void main(String[] args) {
        new CharInWordUsingOptional();
    }
}

