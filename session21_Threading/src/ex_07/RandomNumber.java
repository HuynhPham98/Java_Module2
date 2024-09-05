package ex_07;

import java.util.Random;

public class RandomNumber extends Thread{
    @Override
    public void run() {
        Random rand = new Random();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Random number " + i+ ": " + rand.nextInt(100));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
