import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Alege o figura. ");
        System.out.println(" 1. Patrat ");
        System.out.println(" 2. Dreptunghi ");
        System.out.println(" 3. Cerc ");

        int optiune = scanner.nextInt();
        double aria = 0;


        switch (optiune) {

            case 1:
                System.out.println("Introduceti latura patratului");
                double latura = scanner.nextDouble();
                aria = Geometry.calculeazaAria(latura);
                System.out.println("Aria este " + aria);
                break;

            case 2:
                System.out.println("Introduceti latura dreptunghiului");
                double latime = scanner.nextDouble();
                System.out.println("Introduceti lungimea dreptunghiului");
                double lungime = scanner.nextDouble();
                aria = Geometry.calculeazaAria(latime, lungime);
                System.out.println("Aria este " + aria);
                break;
            case 3:

                System.out.print("Introduce raza cercului: ");
                double raza = scanner.nextDouble();
                aria = Geometry.calculeazaAria(raza);
                System.out.printf("Aria cercului este: " + aria);
                break;
            default:
                System.out.println("Opțiune invalidă!");
        }

        scanner.close();
    }
}

