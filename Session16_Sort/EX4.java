package ThuatToanSapXepVaTimKiem;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số phần tử có trong mảng là");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1,100);

        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Mang sap xep tang da"+Arrays.toString(arr));
        System.out.println("Mời bạn ");
        int value=Integer.parseInt(sc.next());
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                check=true;
                break;
            }
        }
        if(!check){
            System.err.println("Không tìm thấy ");
        }else {
            System.out.println("Đã tìm thấy ");
        }
    }
}
