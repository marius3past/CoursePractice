package secondhalf;
import java.util.Scanner;
public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score : ");
        int score = scanner.nextInt();
        String result;

        switch (score / 10) {
            case 9:
                result = "A";
                break;
            case 8:
                result = "B";
                break;
            case 7:
                result = "C";
                break;
            case 6:
                result = "D";
                break;
            default:
                result = "F";
                break;
        }

        System.out.println("Your grade is : " + result);
    }
}


