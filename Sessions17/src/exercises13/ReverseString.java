package exercises13;

import java.util.Scanner;

public class ReverseString {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập chuỗi: ");
            String input = scanner.nextLine();


            if (input == null || input.isEmpty()) {
                System.out.println("Lỗi: Chuỗi không hợp lệ. Chuỗi không thể null hoặc rỗng.");
                return; // Kết thúc chương trình
            }

            String reversed = reverseString(input);

            System.out.println("Chuỗi đảo ngược: " + reversed);

            scanner.close();
        }

        public static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder(str);
            return reversed.reverse().toString();
        }
    }


