package baitap.bai05;

import java.util.Stack;

public class Stack_Max {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int max = findMaxElement(arr);
        System.out.println("Phần tử lớn nhất trong mảng là: " +max);
    }

    private static int findMaxElement(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);
        for(int num: arr) {
            if( num > stack.peek()) {
                stack.push(num);
            }
        }
        return stack.peek();
    }
}
