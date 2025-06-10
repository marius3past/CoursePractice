import java.util.Scanner;

public class AgeCategory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Introduceți o vârstă : ");
        int age = scanner.nextInt();
        String category  = (age <= 18 ) ? "Minor" :
        (age <= 29) ? "Tânăr" :
                (age <= 64) ? "Adult" :
                        (age >= 65) ? "Senior" : "";
        System.out.println(" Categoria este : " + category );
        scanner.close();
    }
}