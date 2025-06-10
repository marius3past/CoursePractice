import java.util.Scanner;

public class Statut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Introduceți o vârstă : ");
        int age = scanner.nextInt();
        System.out.println("Introduceți statutul social : ");
        String statut = scanner.nextLine();
      String category = (age < 18 && statut.equals ("este căsătorită")) ? "Beneficiază de reducere" :
              (age > 18 && statut.equals("este căsătorită")) ? "Beneficiază de reducere" : " Nu beneficiază de reducere" ;
        System.out.println("Statut : " + category);
        scanner.close();
    }
}
