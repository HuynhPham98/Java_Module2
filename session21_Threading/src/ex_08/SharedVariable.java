package ex_08;

public class SharedVariable {
    int value = 0;

    // Phương thức để tăng giá trị của biến
    public synchronized void increase() {
        value++;
        System.out.println("Tăng giá trị: " + value);
    }

    // Phương thức để giảm giá trị của biến
    public synchronized void decrease() {
        value--;
        System.out.println("Giảm giá trị: " + value);
    }
}
