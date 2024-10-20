package Seminar12;

@FunctionalInterface
interface SummationFunction {
    double compute(int i);
}

public class SummationSeries {
    public static void main(String[] args) {
        SummationFunction summationFunction = i -> {
            double result = 0.0;
            for (int j = 1; j <= i; j++) {
                result += (double) j / (j + 1);
            }

            return result;
        };
        System.out.printf("%-10s%-10s%n", "i", "m(i)");
        for (int i = 1; i <= 20; i++) {
            double result = summationFunction.compute(i);
            System.out.printf("%-10d%-10.4f%n", i, result);
        }
    }
}
