package problema3;

public class Cerc extends Corpuri{

    private double raza;
    private double pi;

    Cerc(double raza, double pi) {
        this.raza = raza;
        this.pi = pi;
    }

    @Override
    public double getAria() {
        return raza * raza * pi;
    }
}
