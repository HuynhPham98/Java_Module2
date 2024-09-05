package ex_02;

public class Luong1 extends Thread{
    @Override
    public void run() {
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
