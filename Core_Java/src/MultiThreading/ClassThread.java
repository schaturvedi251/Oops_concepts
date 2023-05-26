package MultiThreading;

public class ClassThread extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Value Of Thread2 : " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
