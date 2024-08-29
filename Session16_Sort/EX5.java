package ThuatToanSapXepVaTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class EX5 {
    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        return arr;
    }
    private static int findMinIndex(Integer[] arr,int min) {
        int left = 0;
        int right = arr.length - 1;
        int result=-1;
        while (left < right) {
            int mid = left+(right-left) / 2;
            if (arr[mid] > min) {
                result = mid;
                right = mid + 1;
            }
            else {
                left = mid + 1;
            }
        }
        return result;
    }
    private static int findMaxIndex(Integer[] arr,int max) {
        int left = 0;
        int right = arr.length - 1;
        int result=-1;
        while (left < right) {
            int mid = left+(right-left) / 2;
            if (arr[mid] <= max) {
             result = mid;
             left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Integer[] arr = getArr(); // Tạo mảng đã sắp xếp

        // In mảng ra màn hình
        System.out.println("Generated Sorted Array:");
        System.out.println(Arrays.toString(arr));

        // Nhập giá trị min và max từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter min value: ");
        int min = scanner.nextInt();
        System.out.print("Enter max value: ");
        int max = scanner.nextInt();

        // Tìm vị trí đầu tiên lớn hơn hoặc bằng min
        int start = findMinIndex(arr, min);
        // Tìm vị trí cuối cùng nhỏ hơn hoặc bằng max
        int end = findMaxIndex(arr, max);

        // In kết quả
        if (start == -1 || end == -1 || start > end) {
            System.out.println("No numbers found in the specified range.");
        } else {
            System.out.println("Found " + (end - start + 1) + " numbers in the range:");
            for (int i = start; i <= end; i++) {
                System.out.println("Number: " + arr[i]);
            }
        }
    }

}
