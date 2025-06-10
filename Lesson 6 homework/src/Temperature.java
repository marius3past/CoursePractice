import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a temperature : ");
        int temperature = scanner.nextInt();
        System.out.println(" Enter a max temperature : ");
        int maxTemp = scanner.nextInt();
        System.out.println(" Enter a min temperature : ");
        int minTemp = scanner.nextInt();

        if (temperature > maxTemp)
        {
            System.out.println("Porridge is too hot.");
        }
        else if (temperature < minTemp)
        {
            System.out.println("Porridge is too cold.");
        }
        else {
            System.out.println("Porridge is just right.");
        }

    }
}
