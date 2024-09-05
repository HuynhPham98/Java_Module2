package ex_08;

public class DecreaseThread extends Thread{
    SharedVariable sharedVar;

    // Constructor để truyền vào đối tượng SharedVariable
    public DecreaseThread(SharedVariable sharedVar) {
        this.sharedVar = sharedVar;
    }

    @Override
    public void run() {
        while (true) {
            sharedVar.decrease();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
