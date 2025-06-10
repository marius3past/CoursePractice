package firsthalf;
import java.util.Scanner;
public class Number2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a floating-point number : ");
        float number = scanner.nextFloat();
        if (number == 0) {
            System.out.println(number);
        }
        else if (number > 0) {
            System.out.println(" positive ");
        }
        else {
            System.out.println(" negative ");
        }
        if (number<1) {
            System.out.println("small");
        }
        else if (number > 1000000) {
            System.out.println("large");
        }
        scanner.close();
    }
}
