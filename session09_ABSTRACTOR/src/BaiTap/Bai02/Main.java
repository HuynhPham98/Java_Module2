package Bai02;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4,5);
        shapes[2] = new Square(5);

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Shape) {
                System.out.println("Chu vi: " + shapes[i].getPerimeter());
                System.out.println("Diện tích: " + shapes[i].getArea());
            }
        }
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Colorable) {
                ((Colorable) shapes[i]).howToColor();
            }
        }
    }
}
