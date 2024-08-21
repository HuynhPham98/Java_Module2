package baitap.bai6;

import java.util.ArrayList;
import java.util.List;

public class List_Duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(5,4,8,3,5,9));
        System.out.println("Danh sách mảng cũ: ");
        System.out.println(list);
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if(!newList.contains(list.get(i))){
                newList.add(list.get(i));
            }
        }
        System.out.println("Danh sách mảng mới: ");
        System.out.println(newList);
    }
}
