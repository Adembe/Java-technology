package lab9;

public class Robot {
    public Robot() {
        RobotStep rightStep = new RobotStep("right");
        RobotStep leftStep = new RobotStep("left");
        leftStep.start();
        rightStep.start();
        try {
            leftStep.join();
            rightStep.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Robot();
    }
}
