package Baitap.bai03.business.entity;

import Baitap.bai03.business.feature.DeparmentFeature;
import Baitap.bai03.business.feature.Impl.DeparmentFeatureImpl;

import java.util.List;
import java.util.Scanner;

public class Department {
    private String idDepart;
    private String nameDepart;
    private int totalMembers;

    public Department() {
    }

    public Department(String idDepart, String nameDepart, int totalMembers) {
        this.idDepart = idDepart;
        this.nameDepart = nameDepart;
        this.totalMembers = totalMembers;
    }

    public String getIdDepart() {
        return idDepart;
    }

    public void setIdDepart(String idDepart) {
        this.idDepart = idDepart;
    }

    public String getNameDepart() {
        return nameDepart;
    }

    public void setNameDepart(String nameDepart) {
        this.nameDepart = nameDepart;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    public void inputDataDepart(Scanner sc) {
        this.idDepart = inputDepartId(sc, DeparmentFeatureImpl.deparments);
        this.nameDepart = inputDepartName(sc,DeparmentFeatureImpl.deparments);
        this.totalMembers = 0;
    }

    /*public int inputTotalMembers(Scanner sc) {
        System.out.println("Nhập số lượng nhân viên: ");
        while (true) {
            try{
                int totalMembers = Integer.parseInt(sc.nextLine());
                if (totalMembers < 0) {
                    System.err.println("Số nhân viên phòng ban lớn hơn bằng 0");
                } else {
                    return totalMembers;
                }
            } catch (NumberFormatException e) {
                System.err.println("Số nhân viên phải là số nguyên");
            }
        }
    }*/

    public String inputDepartName(Scanner sc, List<Department> deparments) {
        System.out.println("Nhập tên phòng ban: ");
        while (true) {
            String nameDepart = sc.nextLine().trim();
            if (nameDepart.isEmpty()) {
                System.err.println("Tên phòng ban không được để trống");
            } else {
                boolean check = deparments.stream().
                        anyMatch(department -> department.getNameDepart().equalsIgnoreCase(nameDepart));
                if(check) {
                    System.err.println("Tên phòng ban đã tồn tại. Vui lòng nhập mã khác.");
                } else {
                    return nameDepart;
                }
            }
        }
    }

    public String inputDepartId(Scanner sc, List<Department> deparments) {
        System.out.println("Nhập mã phòng ban: ");
        while (true) {
            String idDepart = sc.nextLine().trim();
            if (idDepart.matches("^D\\w{3}$")) {
                boolean check = deparments.stream().
                        anyMatch(department -> department.getIdDepart().equalsIgnoreCase(idDepart));
                if (check) {
                    System.err.println("Mã phòng ban đã tồn tại. Vui lòng nhập mã khác.");
                } else {
                    return idDepart;
                }
            } else {
                System.err.println("Mã phòng ban bắt đầu bằng ký tự D và gồm 4 ký tự");
            }
        }
    }

    public String inputUpdateNameDepart(Scanner sc) {
        System.out.println("Nhập vào tên mới (tên cũ: " +this.getNameDepart()+ "): ");
        do{
            String depName = sc.nextLine().trim();
            if(depName.equals(this.getNameDepart())) {
                return depName;
            } else {
                boolean isExist = DeparmentFeatureImpl.deparments.stream().
                        anyMatch(e->e.getNameDepart().equalsIgnoreCase(depName));
                if(isExist) {
                    System.err.println("Tên phòng ban đã tồn tại");
                } else {
                    return depName;
                }
            }
        }while (true);
    }

    public void displayDateDepart() {
        System.out.printf(" [ Id: %s | Name: %s | Total Members: %d ]",
                this.idDepart,
                this.nameDepart,
                this.totalMembers);
    }
}
