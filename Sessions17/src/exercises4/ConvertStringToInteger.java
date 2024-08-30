package exercises4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class ConvertStringToInteger {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập một chuỗi: ");
            String input = scanner.nextLine();

            List<Integer> integerList = new ArrayList<>();

            for (int i = 0; i < input.length(); i++) {
                char character = input.charAt(i);
                try {

                    int num = Integer.parseInt(String.valueOf(character));
                    integerList.add(num);
                } catch (NumberFormatException e) {

                    integerList.add(0);
                    System.out.println("Ký tự '" + character + "' không phải số nguyên, được thay thế bằng 0.");
                }
            }

            // Hiển thị kết quả
            System.out.print("Danh sách số nguyên sau khi chuyển đổi: ");
            for (int num : integerList) {
                System.out.print(num + " ");
            }
        }
    }


