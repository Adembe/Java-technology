package Seminar6;

import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class RandomPointSort {
    Point2D[] point2DS = new Point2D[100];
    Random random = new Random();

    public RandomPointSort() {
        Double x, y;
        for (int i = 0; i < point2DS.length; i++) {
            x = random.nextDouble();
            y = random.nextDouble();
            point2DS[i] = new Point2D.Double(x, y);
        }

        Arrays.sort(point2DS, new Comparator<Point2D>() {
            @Override
            public int compare(Point2D o1, Point2D o2) {
                int xComparison = Double.compare(o1.getX(), o2.getX());
                if (xComparison != 0) {
                    return xComparison;
                } else {
                    return Double.compare(o1.getY(), o2.getY());
                }
            }
        });

        for (Point2D point : point2DS) {
            System.out.println("Point (x = " + point.getX() + ", y = " + point.getY() + ")");
        }
    }

    public static void main(String[] args) {
        new RandomPointSort();
    }
}
