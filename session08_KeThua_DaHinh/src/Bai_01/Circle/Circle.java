package Bai_01.Circle;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void input(Scanner sc) {
        System.out.println("Nhập bán kính đường tròn: ");
            radius = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập màu sắc hình tròn: ");
            color = sc.nextLine();
    }

    public double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public void display() {
        System.out.println("Bán kính hình tròn: " +radius);
        System.out.println("Màu sắc hình tròn: " +color);
        System.out.println("Diện tích hình tròn: " +area(radius));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
