import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operation;
        do {
            System.out.println("Alege un număr");
            if (scanner.hasNextInt()) {
                operation = scanner.nextInt();
                switch (operation) {
                    case 1:
                        System.out.println("Adunare a două numere");
                        break;
                    case 2:
                        System.out.println("Scădere a două numere");
                        break;
                    case 3:
                        System.out.println("Înmulțire a două numere");
                        break;
                    case 4:
                        System.out.println("Împărțire a două numere");
                        break;
                    case 5:
                        System.out.println("Ieșire din program");
                        break;
                    default:
                        System.out.println("Operator invalid");
                        break;
                }
            }
            else {
                operation = -1;
                System.out.println("Alege alt operator");
                scanner.next();
            }
        }
        while (operation != 5);
        {
            System.out.println("Programul este încheiat");
            scanner.close();
        }
    }
}