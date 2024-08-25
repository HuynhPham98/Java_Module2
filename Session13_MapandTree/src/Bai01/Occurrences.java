package Bai01;

import java.util.HashMap;
import java.util.Map;

public class Occurrences {
    public static void main(String[] args) {
        String[] arr = {"h","e","l","l","o","w","o","r","l","d"};
        HashMap<String,Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for(Map.Entry<String,Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " xuất hiện : " + entry.getValue());
        }
    }
}
