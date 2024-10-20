package lab1;

import java.util.Scanner;

import static java.lang.System.out;

public class Bodlogo3 {

    double x,y,fx;
    final double esp = Math.pow(10,-3);

    public Bodlogo3() {
        CurveCheck();
    }

    public void Scanner(){
        Scanner scanner = new Scanner(System.in);
        out.print("X tsegiin koordinatiig oruulna uu : ");
        x = scanner.nextDouble();
        out.print("Y tsegiin koordinatiig oruulna uu : ");
        y = scanner.nextDouble();
    }

    public void CurveCheck(){
        Scanner();
        if(x > 1){
            fx = Math.pow(Math.sin(Math.pow(x,3)),2);
            if(Math.abs(fx-y)<esp){
                out.printf("x : %.1f ba y : %.1f tsegvvd murui deer orshij baina.",x,y);
            }
            else {
                out.printf("x : %.1f ba y : %.1f tsegvvd murui deer orshihgvi baina.",x,y);
            }
        }
        else{
            fx = Math.sqrt(6*(Math.asin(Math.pow(0.5,7)))+4.5*Math.pow(0.5,6)+4*Math.pow(0.5,2)+2);
            if(Math.abs(fx-y)<esp){
                out.printf("x : %f ba y : %f tsegvvd murui deer orshij baina.",x,y);
            }
            else {
                out.printf("x : %f ba y : %f tsegvvd murui deer orshihgvi baina.",x,y);
            }
        }
    }

    public static void main(String[] args) {
        new Bodlogo3();
    }
}
