package exercises11;
import java.util.Scanner;

    public class DateValidator {
        public static void main(String[] args)  {
            Scanner scanner = new Scanner(System.in);
            boolean validDate = false;

            while (!validDate) {
                try {
                    System.out.print("Nhập ngày: ");
                    int day = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nhập tháng: ");
                    int month = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nhập năm: ");
                    int year = Integer.parseInt(scanner.nextLine());

                    validateDate(day, month, year);

                    System.out.println("Ngày tháng năm hợp lệ");
                    validDate = true; // Đặt cờ thành true để thoát khỏi vòng lặp
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi: Giá trị nhập vào không phải là số. Vui lòng thử lại.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Lỗi: " + e.getMessage());
                    System.out.println("Vui lòng nhập lại.");
                }
            }

            scanner.close();
        }


        public static void validateDate(int day, int month, int year) {
            if (year <= 0) {
                throw new IllegalArgumentException("Năm phải lớn hơn 0.");
            }

            if (month < 1 || month > 12) {
                throw new IllegalArgumentException("Tháng phải nằm trong khoảng từ 1 đến 12.");
            }

            int maxDays = getMaxDaysInMonth(month, year);
            if (day < 1 || day > maxDays) {
                throw new IllegalArgumentException("Ngày phải nằm trong khoảng từ 1 đến " + maxDays + ".");
            }
        }

        public static int getMaxDaysInMonth(int month, int year) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                case 2:
                    return isLeapYear(year) ? 29 : 28;
                default:
                    throw new IllegalArgumentException("Tháng không hợp lệ.");
            }
        }

        public static boolean isLeapYear(int year) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }
