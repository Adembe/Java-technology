package lab10;
public class RobotChat {
    public RobotChat() {
        final TwoRobotChat conversation = new TwoRobotChat();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                conversation.robot1();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                conversation.robot2();
            }
        });

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        new RobotChat();
    }
}
