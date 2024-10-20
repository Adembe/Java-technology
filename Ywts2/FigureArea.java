package Ywts2;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FigureArea {


    public FigureArea() {
        Scanner scanner = new Scanner(System.in);

        // Input data
        int n = scanner.nextInt();
        double[] coordinates = new double[n * 2];
        for (int i = 0; i < n * 2; i++) {
            coordinates[i] = scanner.nextDouble();
        }

        // Calculate and print the area of the polygon using functional programming
        double result = figureSumOfArea.calculate(coordinates);
        System.out.println("S = " + result);

        scanner.close();
    }
    public static TriangleInterface triangleSumArea = (x1, y1, x2, y2, x3, y3) ->
            Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
    public static FigureOfArea figureSumOfArea = FigureArea::figureAreaCalc;

    public static double figureAreaCalc(double[] coordinates) {
        int n = coordinates.length / 2;

        double totalArea = IntStream.range(1, n - 1)
                .mapToDouble(i -> {
                    int index = i * 2;
                    double x1 = coordinates[0];
                    double y1 = coordinates[1];
                    double x2 = coordinates[index];
                    double y2 = coordinates[index + 1];
                    double x3 = coordinates[index + 2];
                    double y3 = coordinates[index + 3];

                    return triangleSumArea.calculate(x1, y1, x2, y2, x3, y3);
                })
                .sum();

        return Math.round(totalArea * 100.0) / 100.0; // Round to two decimal places
    }

    public static void main(String[] args) {
        new FigureArea();
    }

}
