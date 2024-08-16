package Bai03;

import Bai03.MoveablePoint.MoveablePoint;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point point = new Point(1,2);
        MoveablePoint moveablePoint = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());

    }
}
