package secondhalf;
import java.util.Scanner;
public class Age2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = scanner.nextInt();
        boolean isStudent;
        if (scanner.hasNextBoolean()) {
            isStudent = scanner.hasNextBoolean();
            if (isStudent || age < 18) {
                System.out.println(" You get a 20% discount");
            } else {
                System.out.println(" No discount");
            }
            scanner.close();
        }
    }
}