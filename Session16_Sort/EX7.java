package ThuatToanSapXepVaTimKiem;

import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập tên đầu vào ");
        String input=sc.nextLine();
        StringBuilder result=new StringBuilder(String.valueOf(input.charAt(0)));
        for (int i = 0; i < input.length(); i++) {
            if(Character.valueOf(result.charAt(result.length()-1)).compareTo(Character.valueOf(input.charAt(i))) < 0){
                result.append(input.charAt(i));
            }
            System.out.println(result);
        }
    }
}
