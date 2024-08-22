package baitap.bai07;

import java.util.Scanner;
import java.util.Stack;

public class DecreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Nhập một chuỗi để kiểm tra tính giảm dần: ");
        String input = sc.nextLine();
        for(char c : input.toCharArray()) {
            stack.push(c);
        }

        // Khởi tạo biến flag để lưu trữ kết quả kiểm tra
        boolean check = true;

        // Lấy ký tự đầu tiên (ở đỉnh Stack) làm tham chiếu
        char prev = stack.pop();

        while(!stack.isEmpty()) {
            char current = stack.pop();
            if (current > prev) {
                check = false;
                break;
            }
            prev = current;
        }
        // Kiểm tra kết quả

        if(check) {
            System.out.println("Chuỗi là dãy giảm dần.");
        } else {
            System.out.println("Chuỗi không phải là dãy giảm dần.");
        }
        sc.close();
    }
}
