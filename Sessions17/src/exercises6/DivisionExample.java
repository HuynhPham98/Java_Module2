package exercises6;

import java.util.Scanner;

    public class DivisionExample {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int dividend, divisor, result;

            try {
                System.out.print("Nhập số bị chia: ");
                dividend = scanner.nextInt();

                System.out.print("Nhập số chia: ");
                divisor = scanner.nextInt();

                if (divisor == 0) {
                    throw new ArithmeticException("Lỗi: Không thể chia cho 0!");
                }

                result = dividend / divisor;

                System.out.println("Kết quả của phép chia: " + result);
            } catch (ArithmeticException e) {

                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Lỗi: Đầu vào không hợp lệ!");
            } finally {
                scanner.close();
            }
        }
    }

