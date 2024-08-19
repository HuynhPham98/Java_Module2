import Bai01.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3,5);
        shapes[2] = new Square(5);

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Shape) {
                System.out.println("Trước khi thay đổi diện tích: " + shapes[i].getArea());
                System.out.println("Trước khi thay đổi chu vi: " + shapes[i].getPerimeter());

                double ramdomNumber = Math.floor(Math.random()*100);

                if(shapes[i] instanceof Resizable) {

                    ((Resizable) shapes[i]).size(ramdomNumber);

                    System.out.println(ramdomNumber);
                    System.out.println("Sau khi thay đổi diện tích: " + shapes[i].getArea());
                    System.out.println("Sau khi thay đổi chu vi: " + shapes[i].getPerimeter());
                }
            }
        }
    }
}
