package baitap.bai9.business.feature;

import baitap.bai9.business.entity.Student;

public interface IStudentFeature {

    void addStudent(Student student);
    void removeStudent(int deleteId);
    Student findStudentById(int id);
    double getAverageScore();
    void sortByScore();

}
