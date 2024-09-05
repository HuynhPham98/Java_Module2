package ex_10;

public class SleepThread extends Thread{
    private int sleepTime;

    // Constructor nhận vào số giây để thread ngủ
    public SleepThread(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread sẽ ngủ trong " + sleepTime + " giây...");
            // Chuyển đổi từ giây sang milliseconds và cho thread ngủ
            Thread.sleep(sleepTime * 1000);
            System.out.println("Thread đã dậy sau khi ngủ " + sleepTime + " giây!");
        } catch (InterruptedException e) {
            System.out.println("Thread bị gián đoạn!");
        }
    }
}
