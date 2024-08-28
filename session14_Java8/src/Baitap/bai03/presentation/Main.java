package Baitap.bai03.presentation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("""
                                    ======================= MENU =======================
                    					         1. Quản lý phòng ban
                    					         2. Quản lý nhân sự
                    					         3. Thoát
                    				====================================================
                    					  Lựa chọn đê:
                               """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:{
                    DepartmentManage menuDepart = new DepartmentManage();
                    menuDepart.menuDepartment(sc);
                    break;
                }
                case 2:{
                    EmployeeManage menuEmp = new EmployeeManage();
                    menuEmp.menuEmployee(sc);
                    break;
                }
                case 3:{
                    System.exit(0);
                    break;
                }
                default:
                    System.err.println("Vui lòng nhập từ 1->3");
            }
        }while (true);
    }
}
