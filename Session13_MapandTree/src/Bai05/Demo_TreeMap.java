package Bai05;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeMap;

public class Demo_TreeMap {
    public static void main(String[] args) {
        int n = 10;
        Random rand = new Random();
        int[] arr = new int[n];
        System.out.println("Các phần tử của mảng là: ");
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
            System.out.println(i + ": " + arr[i]);
        }
        System.out.println();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i],0);
        }

        int minElement = map.firstKey();
        System.out.println("Phần tử nhỏ nhất là: " + minElement);

        TreeMap<Integer, Integer> map2 = new TreeMap<>(Comparator.reverseOrder());
        map2.putAll(map);

        map2.remove(map2.firstKey());
        int maxElement2 = map2.firstKey();
        System.out.println("Phần tử lớn thứ hai trong mảng là: " + maxElement2);
    }
}
