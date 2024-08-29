package ThuatToanSapXepVaTimKiem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EX6 {

  public static void insertionSort(int[] arr){
      for(int i=1;i<arr.length;i++){
          int currentInsert = arr[i];
          int j;
          for(j=i-1;j>=0;j--){
              arr[j+1]=arr[j];
          }
          arr[j]=currentInsert;

      }
  }
    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr, Collections.reverseOrder()); // Sắp xếp mảng giảm dần
        return arr;
        /** Copyright belongs to Rekkei Academy */
    }

    // Phương thức tìm kiếm vị trí đầu tiên nhỏ hơn hoặc bằng x
    private static int findMinIndex(Integer[] arr, int min) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= min) {
                result = mid;
                right = mid - 1; // Tìm kiếm bên trái để tìm vị trí đầu tiên
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    // Phương thức tìm kiếm vị trí cuối cùng lớn hơn hoặc bằng x
    private static int findMaxIndex(Integer[] arr, int max) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= max) {
                result = mid;
                left = mid + 1; // Tìm kiếm bên phải để tìm vị trí cuối cùng
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Phương thức main
    public static void main(String[] args) {
        Integer[] arr = getArr(); // Tạo mảng đã sắp xếp đảo ngược

        // In mảng ra màn hình
        System.out.println("Generated Sorted Array (Descending):");
        System.out.println(Arrays.toString(arr));

        // Nhập giá trị min và max từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter min value: ");
        int min = scanner.nextInt();
        System.out.print("Enter max value: ");
        int max = scanner.nextInt();

        // Tìm vị trí đầu tiên nhỏ hơn hoặc bằng min
        int start = findMinIndex(arr, min);
        // Tìm vị trí cuối cùng lớn hơn hoặc bằng max
        int end = findMaxIndex(arr, max);

        // In kết quả
        if (start == -1 || end == -1 || start > end) {
            System.out.println("No numbers found in the specified range.");
        } else {
            System.out.println("Found " + (start - end + 1) + " numbers in the range:");
            for (int i = end; i <= start; i++) {
                System.out.println("Number: " + arr[i]);
            }
        }
    }
}
