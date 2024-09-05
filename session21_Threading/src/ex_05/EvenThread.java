package ex_05;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println("Even Thread: " +i);
            }
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
