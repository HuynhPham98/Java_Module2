package Bai02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SingleElement {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Apple", "Orange", "Banana", "Kiwi", "Grapes", "Kiwi"};
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }

        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        System.out.println("Các phần tử duy nhất là: ");
        for(String s : list) {
            System.out.println(s);
        }
    }
}
