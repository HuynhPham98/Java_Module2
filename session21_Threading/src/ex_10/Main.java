package ex_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Yêu cầu người dùng nhập số giây để thread ngủ
        System.out.print("Nhập vào số giây để thread ngủ: ");
        int seconds = sc.nextInt();

        // Tạo đối tượng thread với thời gian ngủ được nhập vào
        SleepThread sleepThread = new SleepThread(seconds);

        // Khởi động thread
        sleepThread.start();
    }
}
