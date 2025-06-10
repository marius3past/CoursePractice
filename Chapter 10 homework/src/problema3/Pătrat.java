package problema3;

public class Pătrat extends Corpuri{
    private double latura;

    Pătrat(double latura) {
        this.latura = latura;
    }

    @Override
    public double getAria() {
        return latura * latura;
    }
}
