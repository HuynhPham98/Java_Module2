package ex_11;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberThread extends Thread{
    private List<Integer> primeNumbers = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 1; i <= 10000 ; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        System.out.println("Danh sách các số nguyên tố từ 1 đến 10,000:");
        for (int i : primeNumbers) {
            System.out.println(i);
        }
    }

    private boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
