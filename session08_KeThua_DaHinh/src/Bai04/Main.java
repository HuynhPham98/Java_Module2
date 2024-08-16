package Bai04;

import Bai04.Shape.Shape;
import Bai04.Triangle.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Nhập màu sắc hình khối: ");
        String color = sc.nextLine();
        System.out.println("Nhập cạnh thứ nhất: ");
        double side1 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập cạnh thứ hai: ");
        double side2 = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập cạnh thứ ba: ");
        double side3 = Double.parseDouble(sc.nextLine());

        if(side1+side2 > side3 && side1+side3 > side2 && side1+side3 > side2){
            Triangle triangle = new Triangle(color,side1,side2,side3);
            System.out.println("Màu hình khối: " +color);
            System.out.println("Diện tích tam giác: " +triangle.getArea(sc));
            System.out.println("Chu vi tam giác: " +triangle.getPerimeter(sc));
        } else {
            System.err.println("Nhập lại");
        }
    }
}
