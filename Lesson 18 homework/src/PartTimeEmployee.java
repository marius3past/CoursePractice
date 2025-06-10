public class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private int hourlyRate;

    PartTimeEmployee(String name,int hoursWorked, int hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
