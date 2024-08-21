package baitap.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class List_Random {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random= new Random();

        for (int i = 0; i < Math.random()*10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Mang so nguyen: " +list);

        //Tim phan tu max theo Collections.max();
        int max = Collections.max(list);
        System.out.println("Phan tu co gia tri max: " +max);

        //Đảo ngược vị trí các phần tử
        Collections.reverse(list);
        System.out.println("Phan tu co gia tri max: ");
        System.out.println(list);

        //Sắp xếp giá trị tăng dần
        Collections.sort(list);
        System.out.println("Sắp xếp tăng dần: " );
        System.out.println(list);

        //addAll()
        ArrayList<Integer> list1 = new ArrayList<>(List.of(16,20));
        list1.addAll(list);
        System.out.println("Thêm tất cả các phần tử list vào list1: ");
        System.out.println(list1);

    }
}
