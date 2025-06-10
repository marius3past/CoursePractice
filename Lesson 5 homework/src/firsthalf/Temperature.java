package firsthalf;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a temperature in Celsius : ");
        float temperature = scanner.nextFloat();
        if (temperature < 10) {
            System.out.println(" Wear a jacket");
        }
        else if (temperature <= 25) {
            System.out.println(" It's a nice day");
        }
        else {
            System.out.println(" It's very hot, stay hydrated ! ");
        }
        scanner.close();
    }
}
