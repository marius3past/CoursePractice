import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu o lună : ");
        int months = scanner.nextInt();

        switch (months) {
            case 12 :
                System.out.println("Iarnă");
                    break;
            case 1 :  System.out.println("Iarnă");
                break;
            case 2 :  System.out.println("Iarnă");
                break;
            case 3 :  System.out.println("Primăvară");
                break;
            case 4 :
                System.out.println("Primăvară");
                break;
            case 5 :
                System.out.println("Primăvară");
                break;
            case 6 :
                System.out.println("Vară");
                break;
            case 7 :
                System.out.println("Vară");
                break;
            case 8 :
                System.out.println("Vară");
                break;
            case 9 :
                System.out.println("Toamnă");
                break;
            case 10 :
                System.out.println("Toamnă");
                break;
            case 11 :
                System.out.println("Toamnă");
                break;
            default:
                break;
        }
        scanner.close();
    }
}
