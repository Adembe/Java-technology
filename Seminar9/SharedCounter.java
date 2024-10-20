package Seminar9;

public class SharedCounter extends Thread {
    private static Integer cnt = 0;

    public Integer getCnt() {
        synchronized (cnt) {
            return cnt;
        }
    }

    public void setCnt(Integer cnt) {
        synchronized (this.cnt) {
            this.cnt = cnt;
        }
    }

    @Override
    public void run() {
        synchronized (cnt) {
            cnt++;
        }
    }
}
