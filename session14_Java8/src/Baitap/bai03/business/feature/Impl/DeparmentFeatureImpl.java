package Baitap.bai03.business.feature.Impl;

import Baitap.bai03.business.entity.Department;
import Baitap.bai03.business.entity.Employee;
import Baitap.bai03.business.feature.DeparmentFeature;

import java.util.ArrayList;
import java.util.List;

import static Baitap.bai03.business.feature.Impl.EmployeeFeatureImpl.employees;

public class DeparmentFeatureImpl implements DeparmentFeature {

    public static List<Department> deparments = new ArrayList<>();

    @Override
    public void addOrUpdate(Department department) {

        //Tìm vị trí id xem có tồn tại trong mảng hay không
        int indexCheck = findIndexById(department.getIdDepart());
        if (indexCheck == -1) {
            deparments.add(department);
        } else {
            deparments.set(indexCheck, department);
        }
    }

    @Override
    public void delete(String id) {
        deparments.remove(findIndexById(id));
    }

    @Override
    public int findIndexById(String id) {
        return deparments.stream().map(Department::getIdDepart).toList().indexOf(id);
    }
}
