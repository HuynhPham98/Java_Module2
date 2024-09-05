package ex_06;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int number = 2; // Bắt đầu từ số 2
        while (true) {
            if (isPrime(number)) {
                System.out.println("LazyPrimeFactorization tìm thấy số nguyên tố: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
