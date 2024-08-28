package Baitap.bai03.business.feature.Impl;

import Baitap.bai03.business.entity.Employee;
import Baitap.bai03.business.feature.EmployeeFeature;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFeatureImpl implements EmployeeFeature {

    public static List<Employee> employees = new ArrayList<>();

    @Override
    public void addOrUpdate(Employee employee) {
        int indexCheck = findIndexById(employee.getEmployeeId());
        if (indexCheck == -1) {
            employees.add(employee);
        }else {
            employees.set(indexCheck, employee);
        }
    }

    @Override
    public void delete(String id) {
        employees.remove(findIndexById(id));
    }

    @Override
    public int findIndexById(String id) {
        return employees.stream().map(Employee::getEmployeeId).toList().indexOf(id);
    }

    @Override
    public Employee getEmployeeByIndex(int indexEmpUpdate) {
        if(indexEmpUpdate < 0 || indexEmpUpdate > employees.size()) {
            return null;
        } else
            return employees.get(indexEmpUpdate);
    }
}
