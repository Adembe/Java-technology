package homework14;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NumbersMultiplication {

    public NumbersMultiplication(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the multiplication:");

        int n = scan.nextInt();
        System.out.println(findNumber(n));
    }

    public static int findNumber(int mul) {
        if (mul == 0) {
            return 0;
        }

        return IntStream.iterate(1, i -> i + 1)
                .filter(num -> getProductOfDigits(num) == mul)
                .findFirst()
                .orElse(-1);
    }

    private static int getProductOfDigits(int number) {
        return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        new NumbersMultiplication();
    }
}
