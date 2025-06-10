public class MinutesConverter {
    public static void main(String[] args) {
        long minutes = 535680;
        double minutesInADay = 1440;
        double minutesInAYear = 525600;
        double years = minutes / minutesInAYear;
        double days = (minutes % minutesInAYear) / minutesInADay;
        System.out.println(minutes + " minutes are approximately " + years + " years and " + days + " days");
    }
}
