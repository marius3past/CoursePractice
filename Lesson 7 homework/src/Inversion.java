import java.util.Scanner;

public class Inversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter an integer number : ");
        int number = scanner.nextInt();
        int reversed = 0;
        for (; number > 0; number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            System.out.println(" Reversed number is : " + reversed);
            scanner.close();
        }
    }
}