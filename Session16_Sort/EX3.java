package ThuatToanSapXepVaTimKiem;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số phần tử có trong mảng");
        int n = Integer.parseInt(sc.nextLine());
        Random rand = new Random();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(20) + 1;
        }
        System.out.println(Arrays.toString(arr));

       int value=Integer.parseInt(sc.nextLine());
       boolean check = false;
       for (int i = 0; i < n; i++) {
           if(arr[i]==value){
               check = true;
               break;
           }
       }
       if(!check){
           System.err.println("Không tìm thấy"+value);
       }


    }
}
