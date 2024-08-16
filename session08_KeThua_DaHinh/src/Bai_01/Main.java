package Bai_01;

import Bai_01.Circle.Circle;
import Bai_01.Cylinder.Cylinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle circle = new Circle();
        Circle cylinder = new Cylinder();

        circle.input(sc);
        cylinder.input(sc);

        System.out.println("Circle: ");
        circle.display();

        System.out.println("Cylinder: ");
        cylinder.display();
    }
}
