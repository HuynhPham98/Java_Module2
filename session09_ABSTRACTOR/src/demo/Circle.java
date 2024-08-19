package demo;

import java.util.Scanner;

public class Circle implements Point2D{
    private double radius;
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPrimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void inputData(Scanner sc) {
        System.out.println("Nhập bán kính: ");
        radius = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Diện tích hình tròn là: " +getArea());
        System.out.println("Chu vi hình tròn là: " +getPrimeter());
    }
}
