package exercises10;

import java.util.Scanner;

    public class CircleAreaCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double radius = 0.0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Nhập giá trị bán kính hình tròn: ");
                    radius = Double.parseDouble(scanner.nextLine());

                    if (radius < 0) {
                        System.out.println("Lỗi: Bán kính không thể là số âm. Vui lòng nhập lại.");
                    } else {
                        validInput = true; // Input is valid and non-negative
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Giá trị nhập vào không phải là một số. Vui lòng thử lại.");
                }
            }

            double area = calculateArea(radius);

            System.out.println("Diện tích hình tròn với bán kính " + radius + " là: " + area);

            scanner.close();
        }

        public static double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }
    }
