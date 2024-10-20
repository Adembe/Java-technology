package lab1;

import java.util.Scanner;

import static java.lang.System.out;

public class Bodlogo4 {
    public Bodlogo4() {
        Calculate();
    }
    /*
    1-Hoid Zvgiig
    2-Omnod zvgiig
    3-Baruun zvgiig
    4-Zvvn zvgiig tus tus ilerhiilsen
     */
    int GPS=1;
    int inputCommand = -1;
    public void Calculate(){
        Scanner scanner = new Scanner(System.in);
        while(inputCommand != 0){
            out.printf("input command : %d\n",inputCommand);
            out.print("Command-iig oruulna uu : ");
            inputCommand = scanner.nextInt();
            if(inputCommand == 1){
                if(GPS == 1){
                    GPS = 4;
                }
                else if(GPS == 2){
                    GPS = 3;
                }
                else if(GPS == 3){
                    GPS = 1;
                }
                else{
                    GPS = 2;
                }
            }
            else if(inputCommand == -1){
                if(GPS == 1){
                    GPS = 3;
                }
                else if(GPS == 2){
                    GPS = 4;
                }
                else if(GPS == 3){
                    GPS = 2;
                }
                else{
                    GPS = 1;
                }
            }
            else if(inputCommand == 2){
                if(GPS == 1){
                    GPS = 2;
                }
                else if(GPS == 2){
                    GPS = 1;
                }
                else if(GPS == 3){
                    GPS = 4;
                }
                else{
                    GPS = 3;
                }
            }
            else if(inputCommand == 0){
                out.println("Command duuslaa");
                break;
            }
            else {
                out.println("buruu command baina");
                continue;
            }
        }
        if (GPS == 1){
            out.print("Bairshil togtoogchiin bairlal : N");
        }
        else if(GPS == 2){
            out.print("Bairshil togtoogchiin bairlal : S");
        }
        else if(GPS == 3){
            out.print("Bairshil togtoogchiin bairlal : R");
        }
        else{
            out.print("Bairshil togtoogchiin bairlal : L");
        }
    }

    public static void main(String[] args) {
        new Bodlogo4();
    }
}
