package problema3;

public class Triunghi extends Corpuri{

    private double înălțime;
    private double baza;

    Triunghi(double înălțime, double baza) {
        this.înălțime = înălțime;
        this.baza = baza;
    }


    @Override
    public double getAria() {
        return 0.5 * înălțime * baza;
    }
}
