package Bai_01.Cylinder;

import Bai_01.Circle.Circle;

import java.util.Scanner;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.println("Nhập chiều cao hình nón: ");
             height = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Thể tích hình nón: " +volume(height,getRadius()));
    }

    private double volume(double height, double radius) {
        return height * area(getRadius());


    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + super.getRadius() +
                "color='" + super.getColor() + '\'' +
                "height=" + height +
                '}';
    }
}
