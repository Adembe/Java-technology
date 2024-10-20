package lab10;

import java.util.Scanner;

public class TwoRobotChat {
    String messageRobot2 = "", messageRobot1 = "";
    Scanner scanner = new Scanner(System.in);
    private boolean robot1Finished = false;

    public synchronized void robot1() {
        while (!messageRobot2.equals("Bye")){
            messageRobot1 = scanner.nextLine();
            {
                System.out.println("Robot 1: "+messageRobot1);
                robot1Finished = true;
                notify();
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void robot2() {
        while (!messageRobot1.equals("Bye")){
            if(robot1Finished){
                messageRobot2 = scanner.nextLine();
                System.out.println("Robot 2: "+messageRobot2);
                notify();
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
