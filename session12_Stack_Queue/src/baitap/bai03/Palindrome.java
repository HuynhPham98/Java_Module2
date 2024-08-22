package baitap.bai03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi để kiểm tra Palindrome: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Chuỗi \"" + input + "\" là chuỗi Palindrome.");
        } else {
            System.out.println("Chuỗi \"" + input + "\" không phải là chuỗi Palindrome.");
        }

        sc.close();
    }

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Tạo stack và queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Duyệt qua từng ký tự trong chuỗi đã xử lý và thêm vào stack và queue
        for (char c : cleanedStr.toCharArray()) {
            stack.push(c);
            queue.offer(c);
        }

        // So sánh các ký tự từ stack và queue
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;  // Nếu bất kỳ cặp ký tự nào không giống nhau, không phải Palindrome
            }
        }

        return true;  // Nếu tất cả các cặp ký tự đều giống nhau, là Palindrome
    }
}
