package ThuatToanSapXepVaTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class EX8 {

    public static void main(String[] args) {
        // Bước 1: Khởi tạo mảng với các giá trị được nhập từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp mảng theo thứ tự từ bé đến lớn
        Arrays.sort(array);

        // Hiển thị mảng đã sắp xếp
        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Nhập giá trị cần tìm
        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();

        // Bước 3 và 4: Khai báo hàm binarySearch và thực hiện tìm kiếm
        int result = binarySearch(array, 0, array.length - 1, value);

        // Bước 5: Hiển thị kết quả
        if (result != -1) {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí: " + result);
        } else {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng.");
        }
    }

    // Bước 3 và 4: Hàm tìm kiếm nhị phân đệ quy
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int middle = (left + right) / 2;

            // Bước 5: Kiểm tra giá trị tại middle
            if (array[middle] == value) {
                return middle;
            }
            // Bước 6: Nếu value lớn hơn giá trị tại middle, tìm kiếm ở bên phải
            if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            }
            // Bước 7: Nếu value nhỏ hơn giá trị tại middle, tìm kiếm ở bên trái
            return binarySearch(array, left, middle - 1, value);
        }
        // Bước 8: Nếu không tìm thấy giá trị, trả về -1
        return -1;
    }
}
