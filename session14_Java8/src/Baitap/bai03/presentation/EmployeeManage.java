package Baitap.bai03.presentation;

import Baitap.bai03.business.entity.Department;
import Baitap.bai03.business.entity.Employee;
import Baitap.bai03.business.feature.EmployeeFeature;
import Baitap.bai03.business.feature.Impl.DeparmentFeatureImpl;
import Baitap.bai03.business.feature.Impl.EmployeeFeatureImpl;

import java.util.*;

public class EmployeeManage {
    EmployeeFeature employeeFeature = new EmployeeFeatureImpl();

    public void menuEmployee(Scanner sc) {
        boolean exit = true;
        while (exit) {
            System.out.println("""
					      ======================= MENU =======================
					         1. Hiển thị danh sách nhân viên
					         2. Xem thông tin nhân viên theo mã nhân viên
					         3. Thêm mới nhân viên
					         4. Chỉnh sửa thông tin nhân viên
					         5. Xóa nhân viên
					         6. Thống kê số lượng nhân viên trung bình của mỗi phòng
					         7. Tìm ra 5 phòng có số lượng nhân viên đông nhất
					         8. Tìm ra người quản lý nhiều nhân viên nhất
					         9. Tìm ra 5 nhân viên có tuổi cao nhất công ty
					         10. Tìm ra 5 nhân viên hưởng lương cao nhất
					         11. Thoát
					      ====================================================
					      Lựa chọn đê:
					  """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:{
                    showAllEmp();
                    break;
                }
                case 2:{
                    ShowInforById(sc);
                    break;
                }
                case 3:{
                    addNewEmp(sc);
                    break;
                }
                case 4:{
                    updateEmp(sc);
                    break;
                }
                case 5:{
                    deleteEmp(sc);
                    break;
                }
                case 6:{
                    showMediumByTotalMembers();
                    break;
                }
                case 7:{
                    search5DepbyEmpMax();
                    break;
                }
                case 8:{
                    showManagerByTotalMembers();
                    break;
                }
                case 9:{
                    search5EmpbyAge();
                    break;
                }
                case 10:{
                    show5EmpforSalary();
                    break;
                }
                case 11:{
                    exit = false;
                    break;
                }
                default:
                    System.err.println("Vui lòng nhập từ 1->11");
            }
        }
    }

    private void showManagerByTotalMembers() {
        Map<String,Integer> managerEmployeeCount = new HashMap<>();
        for(Employee employee : EmployeeFeatureImpl.employees) {
            String managerId = employee.getManager().getEmployeeId();
            if(managerId != null && !managerId.isEmpty()) {
                managerEmployeeCount.put(managerId, managerEmployeeCount.getOrDefault(managerId,0) + 1);
            }
        }

        String topManagerId = null;
        int topMember = 0;
        for(Map.Entry<String,Integer> entry : managerEmployeeCount.entrySet()) {

            if(entry.getValue() > topMember) {
                topMember = entry.getValue();
                topManagerId = entry.getKey();
            }
        }

        if(topManagerId != null) {
            String finalTopManagerId = topManagerId;
            Employee topManager = EmployeeFeatureImpl.employees.stream()
                    .filter(e->e.getEmployeeId().equals(finalTopManagerId))
                    .findFirst().orElse(null);
            if(topManager != null) {
                System.out.println("Quản lý có nhiều nhân viên nhất:");
                System.out.printf("[ Name: %s | TotalMember: %d ] \n",topManager.getEmployeeName(), topMember);
            }else {
                System.err.println("Không tìm thấy thông tin quản lý.");
            }
        }else {
            System.out.println("Danh sách quản lý trống.");
        }
    }

    private void showMediumByTotalMembers() {
        DeparmentFeatureImpl.deparments.forEach(e->{
            System.out.printf("[ Name: %s | TotalMembers: %d ]\n",e.getNameDepart(),e.getTotalMembers());
        });
        int sumEmp = DeparmentFeatureImpl.deparments.stream().mapToInt(Department::getTotalMembers).sum();
        int sumDep = DeparmentFeatureImpl.deparments.size();
        double tb = (double) sumEmp /sumDep;
        System.out.println("Số lượng nhân viên trung bình mỗi phòng ban: " +tb);
    }

    private void show5EmpforSalary() {
        EmployeeFeatureImpl.employees.forEach(e->{
            System.out.printf("[ Name: %s | Salary: %s ] \n",e.getEmployeeName(),e.getSalary());
        });

        List<Employee> employeesSalary = EmployeeFeatureImpl.employees.stream()
                .sorted((d1,d2)->Double.compare(d2.getSalary(),d1.getSalary())).limit(5).toList();
        System.out.println("5 nhân viên có lương cao nhất: ");
        employeesSalary.forEach(e->{
            System.out.printf("[ Name: %s | Salary: %s ] \n", e.getEmployeeName(),e.getSalary());
        });
    }

    private void search5EmpbyAge() {
        EmployeeFeatureImpl.employees.forEach(e->{
            System.out.printf("[ Name: %s | BirthDay: %s ] \n",e.getEmployeeName(),e.getEmployeeBirthday());
        });

        List<Employee> employeeList = EmployeeFeatureImpl.employees.stream()
                .sorted((d1,d2)-> Integer.compare(d2.getEmployeeBirthday().getYear(),d1.getEmployeeBirthday().getYear()))
                .limit(5).toList();
        System.out.println("5 nhân viên tuổi lớn nhất: ");
        employeeList.forEach(e->{
            System.out.printf("[ Name: %s | BirthDay: %s ] \n", e.getEmployeeName(),e.getEmployeeBirthday());
        });
    }

    private void search5DepbyEmpMax() {
        DeparmentFeatureImpl.deparments.forEach(e->{
            System.out.printf("[ Name: %s | TotalMembers: %d ]\n",e.getNameDepart(),e.getTotalMembers());
        });

        if(DeparmentFeatureImpl.deparments.isEmpty()) {
            System.err.println("Danh sách trống");
        }else {
            List<Department> departmentList = DeparmentFeatureImpl.deparments.stream()
                    .sorted((d1,d2)-> Integer.compare(d2.getTotalMembers(),d1.getTotalMembers()))
                    .limit(5).toList();
            System.out.println("5 phòng ban có số nhân viên lớn nhất:");
            departmentList.forEach(e->{
                System.out.println(e.getNameDepart()+" "+e.getTotalMembers());
            });
        }
    }

    private void deleteEmp(Scanner sc) {
        System.out.println("Nhập mã nhân viên cần xóa: ");
        String idDelete = sc.nextLine().trim();
        int indexDelete = employeeFeature.findIndexById(idDelete);
        if (indexDelete != -1) {
            employeeFeature.delete(idDelete);
            System.out.println("Xóa thành công...");
        } else {
            System.err.println("Không tồn tại nhân viên");
        }
    }

    private void updateEmp(Scanner sc) {
        System.out.println("Nhập mã nhân viên muốn sửa: ");
        String idEmpUpdate = sc.nextLine().trim();
        int indexEmpUpdate = employeeFeature.findIndexById(idEmpUpdate);
        if (indexEmpUpdate == -1) {
            System.err.println("Không tồn tại nhân viên");
        }else {
            Employee empUpdate = employeeFeature.getEmployeeByIndex(indexEmpUpdate);
            empUpdate.inputDataEmpUpdate(sc);
            employeeFeature.addOrUpdate(empUpdate);
            System.out.println("Cập nhật thành công");
        }
    }



    private void addNewEmp(Scanner sc) {
        System.out.println("Nhập số lượng nhân viên muốn thêm: ");
        try{
            int number = Integer.parseInt(sc.nextLine());
            if(number <= 0) {
                System.err.println("Số lượng muốn thêm lớn hơn 0");
            }else {
                for (int i = 0; i < number; i++) {
                    Employee emp = new Employee();
                    emp.inputDataEmp(sc);
                    employeeFeature.addOrUpdate(emp);
                    System.out.println("Đã thêm nhân viên: " +emp.getEmployeeId());
                }
                System.out.println("Đã thêm thành công");
            }
        } catch (NumberFormatException e) {
            System.err.println("Số lượng nhân viên là số nguyên");
        }
    }

    private void ShowInforById(Scanner sc) {
        System.out.println("Nhập mã nhân viên: ");
        String idEmp = sc.nextLine().trim();

        if(idEmp.isEmpty()) {
            System.err.println("Mã nhân viên không được để trống.");
            return;
        }

        Optional<Employee> employeeOpt = EmployeeFeatureImpl.employees.stream()
                .filter(e->e.getEmployeeId().equals(idEmp)).findFirst();
        if(employeeOpt.isPresent()) {
            Employee employee = employeeOpt.get();
            employee.displayDataEmp();
        } else {
            System.err.println("Không tồn tại nhân viên có mã: " + idEmp);
        }
    }

    private void showAllEmp() {
        if(EmployeeFeatureImpl.employees.isEmpty()) {
            System.err.println("Danh sách trống");
        }
        EmployeeFeatureImpl.employees.forEach(employee -> {
            System.out.printf("[ ID: %s | Name: %s ] \n",employee.getEmployeeId(),employee.getEmployeeName());
        });
    }
}
