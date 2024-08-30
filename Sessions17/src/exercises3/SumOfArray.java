package exercises3;

import java.util.Scanner;

    public class SumOfArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số lượng phần tử của mảng: ");
            int n = scanner.nextInt();
            String[] arr = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                arr[i] = scanner.next();
            }

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                try {
                    int num = Integer.parseInt(arr[i]);
                    sum += num;
                } catch (NumberFormatException e) {
                    // Bỏ qua phần tử nếu không phải số nguyên
                    System.out.println("Phần tử '" + arr[i] + "' không phải là số nguyên. Bỏ qua.");
                }
            }

            System.out.println("Tổng của các phần tử hợp lệ trong mảng là: " + sum);
        }
    }

