package baitap.bai9.business.entity;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String Name;
    private double averageScore;

    public Student() {
    }

    public Student(int studentId, String name, double averageScore) {
        this.studentId = studentId;
        Name = name;
        this.averageScore = averageScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void inputData(Scanner sc) {
        System.out.println("Student ID: ");
        this.studentId = Integer.parseInt(sc.nextLine());
        System.out.println("Name: ");
        this.Name = sc.nextLine();
        System.out.println("Average Score: ");
        this.averageScore = Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "[ " + studentId+ " ," + Name+ ", " + averageScore +" ]";
    }
}
