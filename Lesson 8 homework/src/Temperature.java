public class Temperature {
    public static void main(String[] args) {
        for (int celsius = 0; celsius <= 100; celsius += 10) {
            double farenheit = (celsius * 9.0 / 5.0) + 32;
            System.out.println(celsius + "°C este echivalent cu " + farenheit + "Farenheit");
        }
    }
}