package Bai02;

import Bai02.Point2D.Point2D;
import Bai02.Point3D.Point3D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point2D point2D = new Point2D(1,2);
        System.out.println(point2D);
        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D);
    }
}
