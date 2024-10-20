package homework14;

import java.util.Scanner;

public class TreasureFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of moves:");
        int n = scanner.nextInt();

        double[] result = findTreasureCoordinates(n, scanner);

        System.out.printf("Treasure coordinates: (%.3f, %.3f)%n", result[0], result[1]);
    }

    public static double[] findTreasureCoordinates(int n, Scanner scanner) {
        double x = 0;
        double y = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter direction (1 to 8) for move " + (i + 1) + ":");
            int direction = scanner.nextInt();

            System.out.println("Enter number of steps for move " + (i + 1) + ":");
            int steps = scanner.nextInt();

            switch (direction) {
                case 1:
                    y += steps;
                    break;
                case 2:
                    x += steps / Math.sqrt(2);
                    y += steps / Math.sqrt(2);
                    break;
                case 3:
                    x -= steps;
                    break;
                case 4:
                    x += steps;
                    break;
                case 5:
                    y -= steps;
                    break;
                case 6:
                    x -= steps / Math.sqrt(2);
                    y -= steps / Math.sqrt(2);
                    break;
                case 7:
                    x -= steps;
                    break;
                case 8:
                    x -= steps / Math.sqrt(2);
                    y += steps / Math.sqrt(2);
                    break;
            }
        }

        return new double[]{x, y};
    }
}
