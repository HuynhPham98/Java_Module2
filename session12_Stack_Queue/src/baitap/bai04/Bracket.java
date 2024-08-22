package baitap.bai04;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra: ");
        String input = sc.nextLine();

        if(isValid(input)){
            System.out.println("Chuỗi hợp lệ với dấu ngoặc.");
        } else {
            System.out.println("Chuỗi không hợp lệ với dấu ngoặc.");
        }
    }

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<Character>();
        for(char symbol : str.toCharArray()){
            if(symbol == '(' || symbol == '[' || symbol == '{'){
                stack.push(symbol);
            } else if(symbol == ')' || symbol == ']' || symbol == '}'){
                if(stack.isEmpty()){
                    return false;
                }
            }

            char left = stack.pop();

            if(!isMatching(left,symbol)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatching(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '[' && right == ']') ||
                (left == '{' && right == '}');
    }
}
