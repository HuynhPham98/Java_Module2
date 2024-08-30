package exercises9;

import java.util.Scanner;

    public class FibonacciCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = 0;
            boolean validInput = false;


            while (!validInput) {
                try {
                    System.out.print("Nhập giá trị n (số nguyên dương): ");
                    n = Integer.parseInt(scanner.nextLine());

                    if (n <= 0) {
                        System.out.println("Lỗi: Giá trị n phải là số nguyên dương. Vui lòng thử lại.");
                    } else {
                        validInput = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Giá trị nhập vào không phải là số nguyên. Vui lòng thử lại.");
                }
            }


            int fibonacciNumber = calculateFibonacci(n);


            System.out.println("Số Fibonacci thứ " + n + " là: " + fibonacciNumber);

            // Close the scanner
            scanner.close();
        }


        public static int calculateFibonacci(int n) {
            if (n == 1 || n == 2) {
                return 1;
            }
            int first = 1, second = 1, nth = 1;
            for (int i = 3; i <= n; i++) {
                nth = first + second;
                first = second;
                second = nth;
            }
            return nth;
        }
    }

