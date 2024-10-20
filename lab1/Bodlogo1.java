package lab1;

import static java.lang.System.out;

public class Bodlogo1 {

    double x1,y1,x2,y2,x3,y3;
    public Bodlogo1(){
        Square();
    }
    public void Square(){
        x1 = 1.0;
        y1 = 1.0;
        x2 = -2.0;
        y2 = 1.0;
        x3 = 0.0;
        y3 = 0.0;
        double a1 = x1-x2;
        double b1 = y1-y2;
        double A = Math.sqrt(Math.pow(a1,2)+Math.pow(b1,2));
        out.printf("A talin urt: %.2f\n",A);
        double a2 = x1-x3;
        double b2 = y1-y3;
        double B = Math.sqrt(Math.pow(a2,2)+Math.pow(b2,2));
        out.printf("B talin urt: %.2f\n",B);
        double a3 = x2-x3;
        double b3 = y2-y3;
        double C = Math.sqrt(Math.pow(a3,2)+Math.pow(b3,2));
        out.printf("C talin urt: %.2f\n",C);

        double area = 0.25 * Math.sqrt((A+B+C)*(-A+B+C)*(A-B+C)*(A+B-C));
        out.printf("Triangle Area : %.2f", area);
    }
    public static void main(String[] args) {
        new Bodlogo1();
    }
}