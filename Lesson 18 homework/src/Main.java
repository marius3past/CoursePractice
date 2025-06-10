import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("E1", 5000 ));
        employees.add(new PartTimeEmployee("E2", 75, 30));
        employees.add(new Freelancer("E3", 6, 400));

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " s salary : " + emp.calculateSalary()-);
        }
    }
}