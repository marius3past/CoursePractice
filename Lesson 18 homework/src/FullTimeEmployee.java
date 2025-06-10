public class FullTimeEmployee extends Employee {
    private double monthlylyRate;

    FullTimeEmployee(String name, double monthlylyRate) {
        super(name);
        this.monthlylyRate = monthlylyRate;
    }

    @Override
    public double calculateSalary() {
        return monthlylyRate;
    }
}
