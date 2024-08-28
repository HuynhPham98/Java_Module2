package Baitap.bai03.business.entity;

import Baitap.bai03.business.feature.Impl.DeparmentFeatureImpl;
import Baitap.bai03.business.feature.Impl.EmployeeFeatureImpl;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private LocalDate employeeBirthday;
    private boolean gender;
    private double salary;
    private Employee manager;
    private Department department;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, LocalDate employeeBirthday, boolean gender, double salary, Employee manager, Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.gender = gender;
        this.salary = salary;
        this.manager = manager;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(LocalDate employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void inputDataEmp(Scanner sc) {
        this.employeeId = inputEmpId(sc, EmployeeFeatureImpl.employees);
        this.employeeName = inputEmpName(sc);
        this.employeeBirthday = inputBirthDay(sc);
        this.gender = inputGender(sc);
        this.salary = inputSalary(sc);
        this.manager = inputManager(sc,EmployeeFeatureImpl.employees);
        this.department = inputDepartment(sc, DeparmentFeatureImpl.deparments);
    }

    public void inputDataEmpUpdate(Scanner sc) {
        this.employeeName = inputEmpName(sc);
        this.employeeBirthday = inputBirthDay(sc);
        this.gender = inputGender(sc);
        this.salary = inputSalary(sc);
        this.manager = inputManager(sc,EmployeeFeatureImpl.employees);
        this.department = inputDepartment(sc, DeparmentFeatureImpl.deparments);
    }

    public Department inputDepartment(Scanner sc, List<Department> deparments) {
        DeparmentFeatureImpl.deparments.forEach(e->
                System.out.printf("[ ID: %s | Name: %s ] \n",e.getIdDepart(),e.getNameDepart()));

        System.out.println("Nhập mã phòng ban");
        while (true) {
            String idDepart = sc.nextLine().trim();
            Optional<Department> departmentOpt = DeparmentFeatureImpl.deparments.stream()
                    .filter(e->e.getIdDepart().equals(idDepart)).findFirst();
            if (departmentOpt.isPresent()) {
                Department department = departmentOpt.get();

                if(this.department != null) {
                    this.department.setTotalMembers(this.department.getTotalMembers()-1);
                }

                department.setTotalMembers(department.getTotalMembers()+1);
                return department;
            } else {
                System.err.println("Mã phòng ban không tồn tại");
            }
        }
    }

    public Employee inputManager(Scanner sc, List<Employee> employees) {
        EmployeeFeatureImpl.employees.forEach(e->
                System.out.printf("[ Id: %s | Name: %s ]\n",e.getEmployeeId(),e.getEmployeeName()));

        System.out.println("Nhập id người quản lý: ");
        do{
            String id = sc.nextLine();
            if(id.isBlank()) {
                return null;
            } else {
                Optional<Employee> employee = employees.stream()
                        .filter(e -> e.getEmployeeId().equals(id)).findFirst();
                if(employee.isPresent()) {
                    return employee.get();
                } else {
                    System.err.println("Mã người quản lý không tồn tại.");
                }
            }
        }while (true);
    }

    public double inputSalary(Scanner sc) {
        System.out.println("Nhập lương nhân viên: ");
        do {
            try {
                double salary = Double.parseDouble(sc.nextLine());
                if (salary <= 0) {
                    System.err.println("Lương nhân viên phải lớn hơn 0");
                } else {
                    return salary;
                }
            } catch (NumberFormatException e) {
                System.err.println("Lương nhân viên phải là số thực");
            }
        }while (true);
    }

    public boolean inputGender(Scanner sc) {
        System.out.println("Nhập giới tính nhân viên: ");
        while (true) {
            String gender = sc.nextLine().trim();
            if(gender.isBlank()){
                System.err.println("giới tính không được để trống");
            } else {
                if(gender.equalsIgnoreCase("true") || gender.equalsIgnoreCase("false")) {
                    return Boolean.parseBoolean(gender);
                } else {
                    System.err.println("Nhập true hoặc false");
                }
            }
        }
    }

    public LocalDate inputBirthDay(Scanner sc) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Nhập ngày sinh: ");
        while (true) {
            String birthday = sc.nextLine().trim();
            try {
                return LocalDate.parse(birthday, formatter);
            } catch (DateTimeParseException e) {
                System.err.println("Vui lòng nhập đúng định dạng dd/MM/yyyy");
            }
        }
    }

    public String inputEmpName(Scanner sc) {
        System.out.println("Nhập tên nhân viên: ");
        while (true) {
            String empName = sc.nextLine().trim();
            if (empName.isBlank()) {
                System.err.println("Tên không được để trống");
            } else {
                return empName;
            }
        }
    }

    public String inputEmpId(Scanner sc, List<Employee> employees) {
        System.out.println("Nhập mã nhân viên: ");
        while (true) {
            String idEmp = sc.nextLine();
            if(idEmp.matches("^E\\w{4}$")) {
                boolean check = employees.stream().
                        anyMatch(employee -> employee.getEmployeeId().equalsIgnoreCase(idEmp));
                if(check) {
                    System.err.println("Mã id nhân viên đã tồn tại");
                } else {
                    return idEmp;
                }
            } else {
                System.err.println("Mã nhân viên bắt đầu bằng ký tự E và có 5 ký tự");
            }
        }
    }

    public void displayDataEmp() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        NumberFormat num = NumberFormat.getNumberInstance();

        System.out.printf(" ID: %s | Name: %s | BirthDay: %s | Gender: %s | Salary: %s | Manager: %s | Department: %s\n ",
                this.employeeId,
                this.employeeName,
                this.employeeBirthday.format(formatter),
                this.gender ? "Nam" : "Nữ",
                num.format(this.salary),
                this.manager == null ? "Quản lý" : this.manager.getEmployeeName(),
                this.department.getNameDepart()
                );
    }
}
