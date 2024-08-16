package Bai5;

public class StaticMethod {
    private static double PI = 3.14;

    public static double calCircleArea(double R) {
        double areaCircle = PI * R * R;
        return areaCircle;
    }

    public static double calRectangleArea(double width,double height) {
        double areaRectangle = width * height;
        return areaRectangle;
    }

    public static double calTriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double areaTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return areaTriangle;
    }
}
