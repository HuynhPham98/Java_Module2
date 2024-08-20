package Bai_01;

public class StudentManager {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Khởi tạo sinh viên
        Student student1 = new Student("Nguyễn Văn Nam",19,"HN");
        Student student2 = new Student("Trần Thùy Trang",18,"TH");
        Student student3 = new Student("Tống Mạnh Hùng",18,"ND");

        //Hiển thị thông tin sinh viên
        displayStudent(student1);
        displayStudent(student2);
        displayStudent(student3);

    }

    private static void displayStudent(Student student) {
        System.out.println("------------------------------------------");
        System.out.println("     Thông tin Sinh Viên");

        System.out.println("Tên Sinh Viên : " + student.getName());
        System.out.println("Tuổi          : " + student.getAge());
        System.out.println("Địa chỉ       : " + student.getAdd());

    }
}

