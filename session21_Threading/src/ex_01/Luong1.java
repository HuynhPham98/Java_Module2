package ex_01;

public class Luong1 extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thoi gian: " + i + " giay.");
                Thread.sleep(1000);
            }
            System.out.println("Kết thúc đếm thời gian sau 10 giây!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
