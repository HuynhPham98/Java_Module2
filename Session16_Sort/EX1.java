package ThuatToanSapXepVaTimKiem;

import java.util.Arrays;

public class EX1 {

        private static int[] getArr(){
            int arr[] = new int[20];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);

            }
          return arr;
        }
        public static void main(String[] args) {
            int[] newArr = getArr();
            System.out.println(Arrays.toString(newArr));
            bubbleSort(newArr);
            System.out.println("Mảng lớn nhất là"+Arrays.toString(newArr));
            int maxValue=findMax(newArr);
            System.out.println("so lon nhat là"+maxValue);


        }
        public static void bubbleSort(int[] arr){
            boolean check = true;
            for (int i = 1; i < arr.length; i++) {
                check = false;
                for (int j = 0; j < arr.length - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        check = true;
                    }
                }
            }
        }
        private static int findMax(int[] arr){
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }return max;
        }

}
