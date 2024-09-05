package ex_09;

public class Countdown extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >=1 ; i--) {
            System.out.println("Countdown " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
