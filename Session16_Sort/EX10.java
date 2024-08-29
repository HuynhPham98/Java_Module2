package ThuatToanSapXepVaTimKiem;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        // Bước 1: Nhập chuỗi từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        // Bước 2: Tìm chuỗi con có độ dài lớn nhất và sắp xếp theo thứ tự tăng dần
        String longestSortedSubstring = findLongestSortedSubstring(input);

        // Bước 3: Hiển thị chuỗi con dài nhất
        System.out.println("Chuỗi con sắp xếp có độ dài lớn nhất: " + longestSortedSubstring);

        scanner.close();
    }

    // Phương thức tìm chuỗi con dài nhất sắp xếp theo thứ tự tăng dần
    private static String findLongestSortedSubstring(String input) {
        String longest = "";  // Chuỗi con dài nhất
        String current = "";  // Chuỗi con hiện tại

        for (int i = 0; i < input.length(); i++) {
            // Kiểm tra nếu ký tự hiện tại lớn hơn hoặc bằng ký tự trước đó
            if (i == 0 || input.charAt(i) >= input.charAt(i - 1)) {
                current += input.charAt(i);  // Thêm ký tự vào chuỗi con hiện tại
            } else {
                // So sánh và cập nhật chuỗi con dài nhất
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + input.charAt(i);  // Bắt đầu một chuỗi con mới
            }
        }

        // So sánh chuỗi con cuối cùng với chuỗi con dài nhất
        if (current.length() > longest.length()) {
            longest = current;
        }

        return longest;
    }
}
