package exercises8;

import java.util.Scanner;

    public class PrimeNumberChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Nhập một số nguyên: ");
                    number = Integer.parseInt(scanner.nextLine());
                    validInput = true; // Input is valid
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Giá trị nhập vào không phải là số nguyên. Vui lòng thử lại.");
                }
            }

            if (number < 2) {
                System.out.println(number + " không phải là số nguyên tố.");
            } else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(number + " là số nguyên tố.");
                } else {
                    System.out.println(number + " không phải là số nguyên tố.");
                }
            }

            // Close the scanner
            scanner.close();
        }
    }

