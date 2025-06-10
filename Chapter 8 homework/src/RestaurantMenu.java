import java.util.Scanner;

public class RestaurantMenu {
    private static String menuName;
    private static double totalPrice;

    public RestaurantMenu(String menuName) {
        this.menuName = menuName;
        this.totalPrice = 0;
    }

    public void showMenu() {
        String item1 = " Pasta";
        double price1 = 11.99;
        String item2 = " Pizza ";
        double price2 = 5.99;
        String item3 = " Lasagna";
        double price3 = 7.99;

        System.out.println(" MENU : ");
        System.out.println("1. " + item1 + " - $ " + price1);
        System.out.println("2. " + item2 + " - $ " + price2);
        System.out.println("3. " + item3 + " - $ " + price3);
    }

    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the product name : ");
        String orderName = scanner.nextLine();
        System.out.println(" Enter the quantity : ");
        int quantity = scanner.nextInt();

        calculateTotalPrice(orderName, quantity);
    }

    public static void calculateTotalPrice(String orderName, int quantity) {
        double price = 0;

        if (orderName.equals("Pasta")) {
            price = 11.99;
        } else if (orderName.equals("Pizza")) {
            price = 5.99;
        } else if (orderName.equals("Lasagna")) {
            price = 7.99;
        } else {
            System.out.println(" Sorry, the product is not available. ");
            return;
        }

        double total = price * quantity;
        System.out.println(" The total is " + total);
    }

}

