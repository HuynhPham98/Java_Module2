package ex_04;

import java.util.Random;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName() + " - Số: " + i + " | HashCode: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
