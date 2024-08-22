package baitap.bai09;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số thập phân: ");
        int decimal = sc.nextInt();

        Stack<Integer> stack = new Stack<Integer>();
        while ( decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal = decimal / 2;
        }

        System.out.println("Số nhị phân là: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();
        sc.close();
    }
}
