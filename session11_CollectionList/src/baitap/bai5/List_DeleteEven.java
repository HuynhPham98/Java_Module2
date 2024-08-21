package baitap.bai5;

import java.util.ArrayList;

public class List_DeleteEven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(9);
        System.out.println(list);

        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println("Danh sách sau khi xóa số chẵn: " +list);
    }
}
