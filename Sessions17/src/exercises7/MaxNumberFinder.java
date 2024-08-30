package exercises7;

    import java.util.Scanner;

    public class MaxNumberFinder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num1 = 0, num2 = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Nhập số nguyên thứ nhất: ");
                    num1 = Integer.parseInt(scanner.nextLine());
                    validInput = true; // Input is valid
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Giá trị nhập vào không phải là số nguyên. Vui lòng thử lại.");
                }
            }

            validInput = false; // Reset for the second number

            while (!validInput) {
                try {
                    System.out.print("Nhập số nguyên thứ hai: ");
                    num2 = Integer.parseInt(scanner.nextLine());
                    validInput = true; // Input is valid
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Giá trị nhập vào không phải là số nguyên. Vui lòng thử lại.");
                }
            }

            int max = (num1 > num2) ? num1 : num2;

            System.out.println("Số lớn hơn trong hai số là: " + max);

            scanner.close();
        }
    }


