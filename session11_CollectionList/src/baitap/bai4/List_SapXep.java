package baitap.bai4;

import java.util.ArrayList;
import java.util.Collections;

public class List_SapXep {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(6);
        System.out.println(list);

        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }


}
