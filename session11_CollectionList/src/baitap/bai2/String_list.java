package baitap.bai2;

import java.util.ArrayList;
import java.util.Arrays;

public class String_list {
    public static void main(String[] args) {
        String str = "Rikkei Academy để nông dân biết code";
        ArrayList<String> list = new ArrayList<>();

        String[] words = str.split(" ");
        list.addAll(Arrays.asList(words));

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() > 3) {
                System.out.println(list.get(i));
            }
        }
    }
}
