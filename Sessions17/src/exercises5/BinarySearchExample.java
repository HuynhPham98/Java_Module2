package exercises5;

import java.util.Arrays;
import java.util.Scanner;

    public class BinarySearchExample {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] array = {34, 7, 23, 32, 5, 62};
            System.out.print("Nhập giá trị cần tìm kiếm: ");
            int target;
            try {
                target = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Giá trị nhập vào không phải số nguyên!");
                return;
            }

            Arrays.sort(array);
            System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

            int result = binarySearch(array, target);

            if (result == -1) {
                System.out.println("Phần tử " + target + " không được tìm thấy trong mảng.");
            } else {
                System.out.println("Phần tử " + target + " được tìm thấy tại vị trí: " + result);
            }

            scanner.close();
        }

        public static int binarySearch(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (array[mid] == target) {
                    return mid;
                }

                if (array[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            return -1;
        }
    }


