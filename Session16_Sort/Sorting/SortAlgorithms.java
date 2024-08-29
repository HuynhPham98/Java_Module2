package ThuatToanSapXepVaTimKiem.Sorting;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Thuật toán nhanh nhất là chèn
//Thuật toán nhanh nhất khi mảng gần như sắp xếp rồi là burble sort
public class SortAlgorithms {
    public static void main(String[] args) {
//        int[] arr={32,15,12,1,12,6,7,88,98,33,3};

    //Tạo ra mảng ngẫu nhiên 10000 phần tử
        Random random=new Random();
        List<Integer> list=Stream.generate(()->random.nextInt(10000)).limit(10000).collect(Collectors.toList());
        Integer[] array=list.toArray(new Integer[10000]);
        Integer[] array1=list.toArray(new Integer[10000]);
        Integer[] array2=list.toArray(new Integer[10000]);
//        array=list.toArray()
    }
    public static <T>void bubbleSort(List<T> list, Comparator<T> comparator) {
        //Sắp xếp thuật toán lần này xong
        //1,2,3,4,5,6
        //Tối ưu số lần lặp
        boolean check = true;
        int n = list.size();

        for (int i = 1; i < n && check; i++) {
            check = false;
            for (int j = 0; j < n - i; j++) {
                if (comparator.compare(list.get(j), list.get(j + 1)) > 0) {
                    // Swap elements
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    check = true;
                }
            }

        }
    }
    public static void selectionSort(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int currentMin=arr[i]; // giá trị nhỏ nhất hiện tại
            int index=i;//vị trí ban đầu
        for (int j = i + 1; j < arr.length; j++) {
            if(arr[j]<currentMin) {
                currentMin=arr[j];
                index=j;
            }
        }
        //Sau khi tìm được giá trị bé nhất, tiến hành đổi chỗ nếu khác vị trí
            if(i!=index){
               arr[index]=arr[i];
               arr[i]=currentMin;
            }
        }
    }
    public static void insertionSort(Integer[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // Giả sử phần tử đầu tiên đã được sắp xếp
            // Phần tử cần chèn là thứ i
            int currentInsert = arr[i];
            // Khai báo biến j là vị trí được chèn cho vị trí hiện tại
            int j;
            for (j = i - 1; j >= 0 && currentInsert < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            // Chèn giá trị hiện tại vào vị trí j + 1
            arr[j + 1] = currentInsert;
        }
    }
}
