package baitap.bai08;

import java.util.Scanner;
import java.util.Stack;

public class Check_Prime {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi: ");
        String input = sc.nextLine();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) { // Kiểm tra nếu ký tự là số
                stack.push(Character.getNumericValue(ch)); // Chuyển ký tự thành số và đưa vào stack
            }
        }

        boolean check = true;
        while (!stack.isEmpty()) {
            int number = stack.pop();
            if (!isPrime(number)) {
                check = false;
                break;
            }
        }

        if (check) {
            System.err.println("Tất cả các số trong chuỗi là số nguyên tố.");
        } else {
            System.out.println("Chuỗi chứa ít nhất một số không phải là số nguyên tố.");
        }
        sc.close();
    }

    private static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n) ; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
