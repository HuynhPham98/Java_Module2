package Bai04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo_HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Apple");
        hm.put(2, "Banana");
        hm.put(3, "Orange");
        hm.put(4, "Kiwi");
        hm.put(5, "Grapes");

        System.out.println(hm);

        HashMap<Integer, String> newMap = new HashMap<>();
        newMap.putAll(hm);

        System.out.println("Nhập từ cần kiểm tra");
        String keyToCheck = sc.nextLine();

        if (newMap.containsValue(keyToCheck)) {
            System.out.println("True");
        } else {
            System.err.println("False");
        }
    }
}
