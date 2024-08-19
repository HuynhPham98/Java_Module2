package Bai04;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("blue",5);
        Shape rectang = new Rectangle("red",4,5);

        System.out.println("Hình tròn: " + circle.getArea());
        System.out.println("Màu: " +circle.getColor());
        System.out.println("Hình chữ nhật: " + rectang.getArea());
        System.out.println("Màu: " +rectang.getColor());
    }
}
