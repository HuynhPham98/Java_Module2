package baitap.bai9.presentation;

import baitap.bai9.business.entity.Student;
import baitap.bai9.business.feature.IStudentFeature;
import baitap.bai9.business.feature.impl.StudentFeatureImpl;

import java.util.Scanner;

public class StudentManagement {

    IStudentFeature studentFeature = new StudentFeatureImpl();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();

        do{
            System.out.println("****************************** MENU ******************************");
            System.out.println("*                    1.Show All                                  *");
            System.out.println("*                    2.addStudent                                *");
            System.out.println("*                    3.removeStudent                             *");
            System.out.println("*                    4.findStudentById                           *");
            System.out.println("*                    5.getAverageScore                           *");
            System.out.println("*                    6.sortByScore                               *");
            System.out.println("*                    7.Out                                       *");
            System.out.println("******************************************************************");
            System.out.println("");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                {
                    studentManagement.showAllStudent();
                    break;
                }
                case 2:
                {
                    studentManagement.addNewStudent(sc);
                    break;
                }
                case 3:
                {
                    studentManagement.removeStudent(sc);
                    break;
                }
                case 4:
                {
                    studentManagement.showStudent(sc);
                    break;
                }
                case 5:
                {
                    studentManagement.AverageScore();
                    break;
                }
                case 6:
                {
                    studentManagement.sortByScore();
                    break;
                }
                case 7:
                {
                    System.exit(0);
                    break;
                }
                default:
                    System.err.println("Vui lòng nhập từ 1-7");
            }
        }while(true);
    }

    private void AverageScore() {
        double dtb =  studentFeature.getAverageScore();
        System.out.println("Điểm trung bình :" +dtb);
    }

    private void showStudent(Scanner sc) {
        System.out.println("Nhập id student muốn show: ");
        int idShow = Integer.parseInt(sc.nextLine());
        int indexShow = findIndexById(idShow);
        if(indexShow == -1) {
            System.err.println("Không tìm thấy id trong danh sách");
        } else {
            Student student = studentFeature.findStudentById(idShow);
            System.out.println("Thông tin sinh viên muốn show: " +student);
        }
    }

    public void sortByScore() {
        studentFeature.sortByScore();
        showAllStudent();
    }

    public void removeStudent(Scanner sc) {
        System.out.println("Nhập id muốn xóa: ");
        int idDelete = Integer.parseInt(sc.nextLine());
        int indexDel = findIndexById(idDelete);
        if (indexDel == -1) {
            System.err.println("Không tìm thấy id trong danh sách");
        } else {
            studentFeature.removeStudent(idDelete);
        }
        showAllStudent();
    }

    public int findIndexById(int id) {
        for (int i = 0; i < StudentFeatureImpl.students.size(); i++) {
            if(StudentFeatureImpl.students.get(i).getStudentId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void addNewStudent(Scanner sc) {
        System.out.println("Nhập số lượng muốn thêm: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            Student student = new Student();
            student.inputData(sc);
            studentFeature.addStudent(student);
        }
    }

    public void showAllStudent() {
        if(StudentFeatureImpl.students.isEmpty()) {
            System.err.println("Danh sách trống...");
            return;
        }
        for(Student student : StudentFeatureImpl.students) {
            System.out.println(student);
        }
    }

}
