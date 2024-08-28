package Baitap.bai03.presentation;

import Baitap.bai03.business.entity.Department;
import Baitap.bai03.business.entity.Employee;
import Baitap.bai03.business.feature.DeparmentFeature;
import Baitap.bai03.business.feature.Impl.DeparmentFeatureImpl;
import Baitap.bai03.business.feature.Impl.EmployeeFeatureImpl;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DepartmentManage {
    DeparmentFeature deparmentFeature = new DeparmentFeatureImpl();

    public void menuDepartment(Scanner sc) {
        boolean exit = true;
        while (exit) {
            System.out.println("""
					      ======================= MENU =======================
					         1. Hiển thị danh sách phòng ban
					         2. Thêm mới phòng ban
					         3. Sửa tên phòng ban
					         4. Hiển thị nhân viên theo mã phòng ban
					         5. Xóa phòng ban
					         6. Quay lại
					      ====================================================
					      Lựa chọn đê:
					  """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:{
                    showAllDepart();
                    break;
                }
                case 2:{
                    addNewDepart(sc);
                    break;
                }
                case 3:{
                    editNameDepart(sc);
                }
                case 4:{
                    showEmployByIdDep(sc);
                    break;
                }
                case 5:{
                    deleteDepart(sc);
                    break;
                }
                case 6:{
                    exit = false;
                    break;
                }
                default:
                    System.err.println("Vui lòng nhập từ 1->6");
            }
        }
    }

    public void deleteDepart(Scanner sc) {
        System.out.println("Nhập phòng ban muốn xóa: ");
        String idDelete = sc.nextLine();
        int indexDelete = deparmentFeature.findIndexById(idDelete);
        if (indexDelete == -1) {
            System.err.println("Không tìm thấy phòng ban");
        } else {
            List<Employee> employees = EmployeeFeatureImpl.employees.stream()
                    .filter(e->e.getDepartment().getIdDepart().equals(idDelete)).toList();
            if(employees.isEmpty()) {
                deparmentFeature.delete(idDelete);
                System.out.println("Phòng ban đã được xóa thành công.");
            } else {
                System.err.println("Phòng ban không thể xóa vì vẫn còn nhân viên.");
            }
        }
    }

    public void showEmployByIdDep(Scanner sc) {
        System.out.println("Nhập mã phòng ban: ");
        String idDep = sc.nextLine();
        int indexShow = deparmentFeature.findIndexById(idDep);
        if (indexShow == -1) {
            System.err.println("Không tìm thấy phòng ban");
        } else {
            List<Employee> employeeInDep = EmployeeFeatureImpl.employees.stream()
                    .filter(e->e.getDepartment().getIdDepart().equals(idDep)).toList();
            if(employeeInDep.isEmpty()) {
                System.err.println("Phòng ban này không có nhân viên nào.");
            } else {
                employeeInDep.forEach(e->{
                    System.out.printf("[ ID: %s | Tên nhân viên: %s ]\n", e.getEmployeeId(), e.getEmployeeName());
                });
            }
        }
    }

    public void editNameDepart(Scanner sc) {
        System.out.println("Nhập mã phòng ban sửa tên: ");
        String idDep = sc.nextLine();
        int indexUpdate = deparmentFeature.findIndexById(idDep);
        if (indexUpdate == -1) {
            System.err.println("Không tìm thấy phòng ban");
        } else {
            Department oldDep = DeparmentFeatureImpl.deparments.get(indexUpdate);
            oldDep.setNameDepart(oldDep.getNameDepart());
            deparmentFeature.addOrUpdate(oldDep);
        }
    }

    public void addNewDepart(Scanner sc) {
        System.out.println("Nhập số lượng phòng ban muốn thêm: ");
        int number = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number; i++) {
            Department department = new Department();
            department.inputDataDepart(sc);
            deparmentFeature.addOrUpdate(department);
        }
    }

    public void showAllDepart() {
        if(DeparmentFeatureImpl.deparments.isEmpty()) {
            System.err.println("Danh sách trống...");
            return;
        }
        DeparmentFeatureImpl.deparments.forEach(Department::displayDateDepart);
    }
    }

