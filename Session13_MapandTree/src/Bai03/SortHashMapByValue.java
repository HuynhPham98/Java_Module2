package Bai03;

import java.util.*;

public class SortHashMapByValue {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(3, "Apple");
        hm.put(2, "Banana");
        hm.put(5, "Orange");
        hm.put(1, "Kiwi");
        hm.put(4, "Grapes");

        List<Map.Entry<Integer,String>> entryList = new ArrayList<Map.Entry<Integer,String>>(hm.entrySet());

        Collections.sort(entryList, new Comparator<Map.Entry<Integer,String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        System.out.println("Các phần tử đã sắp xếp theo giá trị tăng dần:");
        for (Map.Entry<Integer,String> entry : entryList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
