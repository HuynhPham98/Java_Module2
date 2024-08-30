package exercises15;
import java.util.Scanner;

public class TriangleValidator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập cạnh a: ");
            double a = scanner.nextDouble();
            System.out.print("Nhập cạnh b: ");
            double b = scanner.nextDouble();
            System.out.print("Nhập cạnh c: ");
            double c = scanner.nextDouble();

            try {
                validateTriangle(a, b, c);
                System.out.println("Đây là một hình tam giác hợp lệ.");
            } catch (IllegalTriangleException e) {
                System.out.println("Lỗi: " + e.getMessage());
            }

            scanner.close();
        }

        public static void validateTriangle(double a, double b, double c) throws IllegalTriangleException {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalTriangleException("Các cạnh của tam giác phải là số dương.");
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalTriangleException("Tổng của hai cạnh phải lớn hơn cạnh còn lại.");
            }
        }
    }


