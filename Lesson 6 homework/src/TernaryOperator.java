import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number : ");
        int colorCode = scanner.nextInt();
        String color = (colorCode == 100) ? "Yellow" :
                (colorCode == 101) ? "Green" :
                        (colorCode == 102) ? "Red" : "Invalid";
        System.out.println("Color --- " + color);
    }
}

