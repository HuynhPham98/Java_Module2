package exercises1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        // Nhập số thứ nhất
        while (true) {
            System.out.print("Nhập số nguyên thứ nhất: ");
            try {
                num1 = Integer.parseInt(scanner.nextLine());
                break;  // Thoát khỏi vòng lặp nếu nhập đúng
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại số nguyên.");
            }
        }

        // Nhập số thứ hai
        while (true) {
            System.out.print("Nhập số nguyên thứ hai: ");
            try {
                num2 = Integer.parseInt(scanner.nextLine());
                break;  // Thoát khỏi vòng lặp nếu nhập đúng
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại số nguyên.");
            }
        }

        // Tính tổng và hiển thị kết quả
        int sum = num1 + num2;
        System.out.println("Tổng của hai số là: " + sum);
    }
}
