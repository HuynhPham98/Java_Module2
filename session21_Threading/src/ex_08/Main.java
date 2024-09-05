package ex_08;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng SharedVariable
        SharedVariable sharedVar = new SharedVariable();

        // Tạo và khởi chạy hai thread
        IncreaseThread increaseThread = new IncreaseThread(sharedVar);
        DecreaseThread decreaseThread = new DecreaseThread(sharedVar);

        increaseThread.start();
        decreaseThread.start();
    }
}
