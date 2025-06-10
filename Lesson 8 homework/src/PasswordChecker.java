import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu o parolă de maxim 3 ori");
        String correctPassword = "parola1111";
        for (int attempts = 1; attempts <= 3; attempts++) {
            System.out.println("Numărul de încercări " + attempts);

            String password = scanner.nextLine();
            if (password.equals(correctPassword)) {
                System.out.println("Utilizatorul este autentificat");
                return;
            } else {
                System.out.println("Utilizatorul nu este autentificat");
            }
        }
        System.out.println("Utilizatorul nu are acces");
        scanner.close();
    }
}
