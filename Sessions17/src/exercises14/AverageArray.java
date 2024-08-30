package exercises14;

import java.util.Scanner;

    public class AverageArray {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số lượng phần tử của mảng: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Lỗi: Số lượng phần tử phải lớn hơn 0.");
                scanner.close();
                return; // Kết thúc chương trình
            }

            int[] array = new int[n];

            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            double average = calculateAverage(array);

            System.out.println("Giá trị trung bình của mảng là: " + average);

            scanner.close();
        }

        public static double calculateAverage(int[] array) {
            int sum = 0;
            for (int value : array) {
                sum += value;
            }
            return (double) sum / array.length;
        }
    }

