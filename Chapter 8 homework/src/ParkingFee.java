public class ParkingFee {
    private int hoursParked;

   public ParkingFee(int hours) {

        if (hours > 24) {
            this.hoursParked = 24;
        }
        else {
            this.hoursParked = hours;
        }
    }



    public double calculateCharges() {
        double fee = 2.0;
        if (hoursParked > 3 && hoursParked <= 24 ) {
            fee = fee + (hoursParked - 3) * 0.5;
        } else if (hoursParked == 24) {
            fee = 10.0;
        }
        return fee;

    }
    public int getHoursParked() {
       return hoursParked;

    }
}