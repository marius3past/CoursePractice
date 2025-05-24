import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alege un rol");
        String role = scanner.nextLine().toUpperCase();
        UserRole userRole = UserRole.valueOf(role);

        switch (userRole) {
            case ADMIN, MODERATOR, USER -> System.out.println("Rolul selectat " + userRole + " - " + userRole.getDescription());
        }

        if (userRole.hasAccesToAdminPanel()) {
            System.out.println(" Au acces la panoul administratorului. ");
        }
        else {
            System.out.println(" Utilizatorul nu are acces la panou.");
        }
    }
}
