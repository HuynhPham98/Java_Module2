package demo;

public abstract class Employee {
    private final Double rate = 100.0;
    public abstract Double getSalary();

    public Double getRate() {
        return rate;
    }
}
