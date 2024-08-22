package baitap.bai01;

import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();

        System.out.println("Nhập số lượng cần thêm: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập từ thứ " +(i+1) + ": ");
            String word = sc.nextLine();
            stack.push(word);
        }

        System.out.println("Các từ được in ra theo thứ tự ngược lại: ");
        while (!stack.isEmpty()) {
            String word = stack.pop();
            System.out.println(word);
        }
        sc.close();
    }
}
