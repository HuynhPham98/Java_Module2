package demo;

public class FullTimeEmp extends Employee{
    @Override
    public Double getSalary() {
        return 8*super.getRate();
    }

}
