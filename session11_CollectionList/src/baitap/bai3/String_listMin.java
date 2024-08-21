package baitap.bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class String_listMin {
    public static void main(String[] args) {
        String str = "Rikkei Academy để nông dân biết code";
        ArrayList<String> list = new ArrayList<>();

        String[] words = str.split(" ");
        list.addAll(Arrays.asList(words));

        String min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() < min.length()) {
                min = list.get(i);
            }
        }
        System.out.println("Phần tử có độ dài ngắn nhất là: "+min);
    }
}
