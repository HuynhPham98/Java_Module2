package LyThuyet;

import demo.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.abstract
        /*
        * Lớp Employee chung có phương thức abstract là tính lương là calculateSalary() và có hệ số lương
        * có 2 lớp FullTimeEmployee và PartTimeEmployee đều là lớp con của Employee
        * Riêng lp fulltime mặc định là 9 tiếng làm
        *
        * */

        Employee employeeFull = new FullTimeEmp();
        Employee employeePart = new PartTimeEmp(4.0);

        System.out.println("Lương fulltime là: " + employeeFull.getSalary());
        System.out.println("Lương parttime là: " + employeePart.getSalary());

/*        Point2D circle = new Circle();
        circle.inputData(sc);
        circle.displayData(); */

        Point3D cylinder = new Cylinder();
        cylinder.inputData(sc);
        ((Cylinder) cylinder).display();
    }
}
