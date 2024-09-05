package ex_06;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int number = 2; // Bắt đầu từ số 2
        while (true) {
            if (isPrime(number)) {
                System.out.println("OptimizedPrimeFactorization tìm thấy số nguyên tố: " + number);
            }
            number++;
        }
    }

    // Hàm kiểm tra số nguyên tố với thuật toán tối ưu (kiểm tra tới căn bậc hai)
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
