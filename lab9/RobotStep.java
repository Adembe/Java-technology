package lab9;

public class RobotStep extends Thread{
    private String leg;

    public RobotStep(String leg) {
        this.leg = leg;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(leg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
