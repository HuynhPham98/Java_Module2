package Baitap.bai01;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Sử dụng Stream API để duyệt qua mảng và phương thức max() để tìm số lớn nhất trong mảng.

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.println(numbers[i]);
        }
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Số lớn nhất trong mảng: " +max);

        //Sử dụng Stream API và phương thức filter() để lọc các số lớn hơn một giá trị xác định mà người dùng nhập vào

        int[] numberMax = Arrays.stream(numbers).filter(num -> num > 40).toArray();
        System.out.println("Mảng số lớn hơn 40 là: " +Arrays.toString(numberMax));

        //Sử dụng Stream API và phương thức filter() để tìm số chẵn

        int[] numberEvent = Arrays.stream(numbers).filter(num -> num % 2 == 0).toArray();
        System.out.println("Mảng số chẵn là: " +Arrays.toString(numberEvent));

        //Sử dụng Stream API và phương thức reduce() để tính tổng của các số trong danh sách.

        int sum = Arrays.stream(numbers).reduce(0, Integer::sum);
        System.out.println("Tổng các số trong mảng: " +sum);

        //Sử dụng Stream API và phương thức anyMatch() để kiểm tra xem danh sách có chứa ít nhất một số chẵn hay không.

        boolean check = Arrays.stream(numbers).anyMatch(num -> num % 2 == 0);
        if(check) {
            System.out.println("Danh sách có chứa ít nhất một số chẵn");
        } else {
            System.out.println("Danh sách không chứa số chẵn nào.");
        }

        //Sử dụng Stream API và phương thức range() để tạo danh sách các số từ x đến y.

        System.out.println("Nhập số ban đầu: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số kết thúc: ");
        int y = Integer.parseInt(sc.nextLine());
        List<Integer> listNumber = IntStream.range(x,y+1).boxed().collect(Collectors.toList());
        System.out.println(listNumber);

        //Sử dụng Stream API và phương thức sorted() để sắp xếp danh sách theo thứ tự bảng chữ cái.

        String[] words = new String[]{"Orange","Apple","Banana","Watermelon"};
        String[] newWords = Arrays.stream(words).sorted().toArray(String[]::new);
        System.out.println(Arrays.toString(newWords));

        //Sử dụng Stream API và phương thức map() để chuyển các chuỗi thành chữ in hoa.

        String[] wordCapital = Arrays.stream(words).map(String::toUpperCase).toArray(String[]::new);
        System.out.println(Arrays.toString(wordCapital));

    }
}
