package Baitap.bai03.business.feature;

import Baitap.bai03.business.entity.Employee;

public interface EmployeeFeature extends IGenericFeature<Employee,String>{
    Employee getEmployeeByIndex(int indexEmpUpdate);
}
