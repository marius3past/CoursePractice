package secondhalf;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Numbers of characters in a password : ");

         int password = scanner.nextInt();
         if (password < 6 ) {
             System.out.println(" Weak password ");
         }
         else if (password <= 12 ){
             System.out.println(" Moderate password ");
         }
         else {
             System.out.println(" Strong password ");
         }
       scanner.close();
    }
}