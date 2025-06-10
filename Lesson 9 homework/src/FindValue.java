import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 8, 10, 15};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a value");
        int findValue = scanner.nextInt();
        boolean contains = false;

        for (int i = 0; i < array.length; i++) {
            if (findValue == array[i]) {
                contains = true;
                break;
            }
        }

        if (contains) {
            System.out.println("The value was founded in the array");
        }

        else {
            System.out.println("The value was not founded in the array ");
        }

        scanner.close();
    }
}
