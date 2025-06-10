import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer : ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number /= 10;
            System.out.println("The sum equals to : " + sum);
        }
        scanner.close();
    }
}