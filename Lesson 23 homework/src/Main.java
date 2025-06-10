import java.util.Scanner;

import static java.util.Calendar.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Alege o zi : ");
        String input = scanner.nextLine().toUpperCase();
        DayOfWeek day = DayOfWeek.valueOf(input);

        switch (day) {
            case MONDAY -> System.out.println("Astazi este " + day.getDayOfWeekName() + " Luni");
            case TUESDAY -> System.out.println("Astazi este " + day.getDayOfWeekName() + " Marti");
            case WEDNESDAY -> System.out.println("Astazi este " + day.getDayOfWeekName() + " Miercuri");
            case THURSDAY -> System.out.println("Astazi este " + day.getDayOfWeekName() + " Joi");
            case FRIDAY -> System.out.println("Astazi este " + day.getDayOfWeekName() + " Vineri");
            case SATURDAY -> System.out.println("Astazi este " + day.getDayOfWeekName() + " Sambata");
            case SUNDAY -> System.out.println("Astazi este " + day.getDayOfWeekName() + " Duminica");
        }

        if (!day.isWeekend()) {
            System.out.println(day.getWorkingHours());
        }
        else {
            System.out.println(" Este zi de weekend! Nu se lucreaza.");
        }
    }
}