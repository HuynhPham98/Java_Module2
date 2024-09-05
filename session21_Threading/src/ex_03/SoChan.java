package ex_03;

public class SoChan extends Thread{
    @Override
    public void run() {

        try {
            for (int i = 1; i <= 100; i++) {
                if(i%2==0) {
                    System.out.println(i+ "la so chan.");
                    Thread.sleep(1000);
                }
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
