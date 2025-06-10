package secondhalf;
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" The price of a movie ticket costs : ");
        int age = scanner.nextInt();
        if (age < 12) {
            System.out.println(" Ticket price : $5");
        }
        else if (age <= 60) {
            System.out.println(" Ticket price : $10");
        }
        else {
            System.out.println(" Ticket price : $7");
        }
        scanner.close();
    }
}
