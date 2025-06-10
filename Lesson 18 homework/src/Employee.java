public abstract class Employee {
    private String name;
    private double salary;

    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   public abstract double calculateSalary();
}
