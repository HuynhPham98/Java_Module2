package ThuatToanSapXepVaTimKiem;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EX12 {
    private static Integer[] getArr() {
        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100); // Tạo số ngẫu nhiên từ 1-99
        }
        Arrays.sort(arr, Collections.reverseOrder()); // Sắp xếp mảng theo thứ tự giảm dần
        return arr;
    }

    // Phương thức tìm kiếm nhị phân
    private static int binarySearch(Integer[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Trả về vị trí tìm thấy
            } else if (arr[mid] < target) {
                right = mid - 1; // Tìm ở nửa bên trái
            } else {
                left = mid + 1; // Tìm ở nửa bên phải
            }
        }
        return -1; // Không tìm thấy
    }

    public static void main(String[] args) {
        // B1: Tạo mảng số nguyên
        Integer[] arr = getArr();

        // B2: In ra mảng số nguyên
        System.out.println("Mảng ngẫu nhiên đã sắp xếp giảm dần:");
        System.out.println(Arrays.toString(arr));

        // B3: Nhập số nguyên từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên cần tìm kiếm: ");
        int target = scanner.nextInt();

        // B4: Cài đặt thuật toán nhị phân để tìm kiếm
        int index = binarySearch(arr, target);

        // B5: In vị trí của số đó ra
        if (index != -1) {
            System.out.println("Phần tử " + target + " được tìm thấy tại vị trí: " + index);
        } else {
            System.out.println("Phần tử " + target + " không có trong mảng.");
        }

        scanner.close();
    }
}
