package lab1;

import java.util.Scanner;
import static java.lang.System.out;
public class Bodlogo2 {


    double x1,y1;

    public Bodlogo2() {
        FindPoint();
    }

    public void Scanner(){
        Scanner scanner = new Scanner(System.in);
        out.print("X tsegiin koordinatiig oruulna uu : ");
        x1 = scanner.nextDouble();
        out.print("Y tsegiin koordinatiig oruulna uu : ");
        y1 = scanner.nextDouble();
    }

    public void FindPoint(){
        Scanner();
        if(x1>0 && y1>0) {
            out.println("Koordinatiin 1-r mujid baina.");
        }
        else if(x1<0 && y1>0){
            out.println("Koordinatiin 2-r mujid baina.");
        }
        else if(x1<0 && y1<0){
            out.println("Koordinatiin 3-r mujid baina.");
        }
        else{
            out.println("Koordinatiin 4-r mujid baina.");
        }
    }

    public static void main(String[] args) {
        new Bodlogo2();
    }
}
