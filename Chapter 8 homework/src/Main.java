public class Main {
    public static void main(String[] args) {
        double total = 0.0;
        ParkingFee user1 = new ParkingFee(6);
        double fee1 = user1.calculateCharges();
        ParkingFee user2 = new ParkingFee(24);
        double fee2 = user2.calculateCharges();
        ParkingFee user3 = new ParkingFee(25);
        double fee3 = user3.calculateCharges();

        System.out.println(" The first user parked for " + user1.getHoursParked() + " hours");
        System.out.println(" The second user parked for " + user2.getHoursParked() + " hours");
        System.out.println(" The third user parked for " + user3.getHoursParked() + " hours");

        System.out.println(" The fee for the first user costs " + fee1);
        System.out.println(" The fee for the second user costs " + fee2);
        System.out.println(" The fee for the third user costs " + fee3);

        total = fee1 + fee2 + fee3;
        System.out.println("The total fee for this day was :  " + total);


    }
}