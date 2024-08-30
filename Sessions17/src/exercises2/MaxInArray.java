package exercises2;

    import java.util.Scanner;

    public class MaxInArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Nhập số lượng phần tử của mảng: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }

            try {

                if (arr.length == 0) {
                    throw new Exception("Mảng rỗng, không có phần tử nào để tìm số lớn nhất.");
                }

                int max = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }

                System.out.println("Số lớn nhất trong mảng là: " + max);
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }
    }
