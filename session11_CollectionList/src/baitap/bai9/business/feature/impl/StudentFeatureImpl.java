package baitap.bai9.business.feature.impl;

import baitap.bai9.business.entity.Student;
import baitap.bai9.business.feature.IStudentFeature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentFeatureImpl implements IStudentFeature {

    public static List<Student> students =  new ArrayList<>();

    static {
        students.add(new Student(1,"Dương Dolce",7.8));
        students.add(new Student(2,"Minh chubby",9.9));
        students.add(new Student(3,"Hùng đan trường",10.0));
        students.add(new Student(4,"Ngọc siscon",8.8));
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int deleteId) {
        students.remove(findStudentById(deleteId));
    }

    @Override
    public Student findStudentById(int id) {
        for (Student student : students) {
            if(student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public double getAverageScore() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageScore();
        }
        return sum / students.size();
    }

    @Override
    public void sortByScore() {
        students.sort(Comparator.comparingDouble(Student::getAverageScore));
    }
}
