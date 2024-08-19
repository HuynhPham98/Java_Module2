package demo;

public class PartTimeEmp extends Employee {
    private double workingHours;

    @Override
    public Double getSalary() {
        return this.workingHours*super.getRate();
    }

    public PartTimeEmp(double workingHours) {
        this.workingHours = workingHours;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }
}
