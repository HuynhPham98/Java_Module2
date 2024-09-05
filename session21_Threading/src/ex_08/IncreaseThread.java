package ex_08;

public class IncreaseThread extends Thread{
    SharedVariable sharedVariable;

    public IncreaseThread(SharedVariable sharedVar) {
        this.sharedVariable = sharedVar;
    }

    @Override
    public void run() {
        while (true) {
            sharedVariable.increase();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
