import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a USD amount : ");
        int usdAmount = scanner.nextInt();
        System.out.println(" Enter a currency code : ");
        String currency = scanner.next();
        double convertedAmount;
        switch (currency) {
            case "EUR" :
                convertedAmount = usdAmount * 0.85;
                System.out.println(" Converted amount equals to : " + convertedAmount);
                break;
            case "GBP" :
                convertedAmount = usdAmount * 0.75;
                System.out.println(" Converted amount equals to : " + convertedAmount);
                break;
            case "INR" :
                convertedAmount = usdAmount * 75.0;
                System.out.println(" Converted amount equals to : " + convertedAmount);
                break;
            case "AUD" :
                convertedAmount = usdAmount * 1.35;
                System.out.println(" Converted amount equals to : " + convertedAmount);
                break;
            default:
                System.out.println("Unsupported currency");
                        break;
        }
        scanner.close();
            }
        }