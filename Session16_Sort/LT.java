package ThuatToanSapXepVaTimKiem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LT {
    public static <T extends Comparable <T>> boolean binarySearching(List<T> list, T element){
        int start=0;
        int end=list.size()-1;
        int mid=start+(end-start)/2;//(start+end)/2
        while(start<=end) {
            if (list.get(mid) == element) {
                return true;
            } else if (list.get(mid).compareTo(element) > 0) {
                //kiem tra danh sach bên trái phần tử mid
                end = mid-1;
            } else {
                //kiểm tra bên phải phần tử mid
               start = mid+1;
            }
        }
        return false;
      //Ap dung tren danh sach lon du lieu lon va rat lon
    }
     public static void main(String[] args) {
         Student s1 = new Student(1,"aaa");
         List<Student> list = Arrays.asList(s1,new Student(2,"ccc"),new Student(3,"ddd") );
//         System.out.println(linearSearching(list,s1));
         System.out.println(binarySearching(list,s1));
     }
//    public static <T> boolean linearSearching(List<T> list, T element) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).equals(element)) {
//                //Tìm được phần tử
//                return true;
//            }
//
//        }
//        return false;
//
//    }
}
