package firsthalf;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width and the length for rectangle 1 : ");
        int width = scanner.nextInt();
        int length = scanner.nextInt(); System.out.println("Enter the width and the length for rectangle 2 : ");
        int width2 = scanner.nextInt();
        int length2 = scanner.nextInt();
        if (width * length > width2 * length2){
            System.out.println("Rectangle 1 has greater area ");
        }
        else {
            System.out.println(" Rectangle 2 has greater area ");
        }
        scanner.close();
    }
}
