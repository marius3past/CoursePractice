public enum DayOfWeek {
    MONDAY(" lu",false),
    TUESDAY("ma", false),
    WEDNESDAY("mi", false),
    THURSDAY("j", false),
    FRIDAY("vi", false),
    SATURDAY("sa", true),
    SUNDAY("du", true);


    private String dayOfWeek;
    private boolean weekend;

    DayOfWeek(String day, boolean weekend) {
        this.dayOfWeek = day;
        this.weekend = weekend;

    }

    public boolean isWeekend() {
     return weekend;
    }

    public String getDayOfWeekName() {
        return dayOfWeek;
    }

    public String getWorkingHours() {
        if (!weekend) {
           return "Programul de lucru : 9:00 - 17:00";
        }
        else return "Nu este o zi lucratoare";
    }
}
