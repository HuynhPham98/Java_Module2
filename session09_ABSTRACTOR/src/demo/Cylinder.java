package demo;

import java.util.Scanner;

public class Cylinder extends Circle implements Point3D{
    private double height;

    @Override
    public void inputData(Scanner sc) {
        super.inputData(sc);
        System.out.println("Nhập chiều cao: ");
        height = Double.parseDouble(sc.nextLine());
    }

    public void display() {
        System.out.println("Thể tích hình trụ: " + getVolume());
    }

    @Override
    public double getVolume() {
        return height*Math.PI*Math.pow(height,2);
    }
}
