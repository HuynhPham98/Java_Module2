package ThuatToanSapXepVaTimKiem;

public class EX13 {
    public static void main(String[] args) {
        // Tạo mảng ngẫu nhiên
        int[] arr = getArr();

        // Sắp xếp chọn
        int[] selectionSortedArr = arr.clone();
        selectionSort(selectionSortedArr);
        System.out.println("Mảng sau khi sắp xếp chọn:");
        printArray(selectionSortedArr);

        // Sắp xếp chèn
        int[] insertionSortedArr = arr.clone();
        insertionSort(insertionSortedArr);
        System.out.println("Mảng sau khi sắp xếp chèn:");
        printArray(insertionSortedArr);

        // Sắp xếp nổi bọt
        int[] bubbleSortedArr = arr.clone();
        bubbleSort(bubbleSortedArr);
        System.out.println("Mảng sau khi sắp xếp nổi bọt:");
        printArray(bubbleSortedArr);
    }

    // Hàm in mảng ra màn hình
    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Hàm getArr như trên
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100) + 1; // Giá trị từ 1 đến 100
        }
        return arr;
    }

    // Các hàm sắp xếp như trên
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
