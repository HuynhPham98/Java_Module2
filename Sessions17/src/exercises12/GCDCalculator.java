package exercises12;

import java.util.Scanner;

    public class GCDCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Nhập số nguyên thứ nhất: ");
                    int num1 = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nhập số nguyên thứ hai: ");
                    int num2 = Integer.parseInt(scanner.nextLine());

                    if (num1 == 0 && num2 == 0) {
                        throw new IllegalArgumentException("Cả hai số đều bằng 0. Không thể tính UCLN.");
                    }

                    int gcd = findGCD(num1, num2);

                    System.out.println("Ước chung lớn nhất (UCLN) của " + num1 + " và " + num2 + " là: " + gcd);
                    validInput = true; // Đặt cờ thành true để thoát khỏi vòng lặp
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Giá trị nhập vào không phải là số nguyên. Vui lòng thử lại.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Lỗi: " + e.getMessage());
                    System.out.println("Vui lòng nhập lại.");
                }
            }

            scanner.close();
        }


        public static int findGCD(int a, int b) {
            if (b == 0) {
                return Math.abs(a);
            }
            return findGCD(b, a % b);
        }
    }

