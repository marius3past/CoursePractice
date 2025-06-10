package problema4;

public class Camion extends Vehicul {
    private double greutataIncarcatura;

    Camion(String nrÎnmatriculare, double consumMediu, double greutataIncarcatura) {
        super(nrÎnmatriculare, consumMediu);
        this.greutataIncarcatura = greutataIncarcatura;
    }

    @Override
    public double calculeazaConsum(double km) {
        double extra = greutataIncarcatura / 200;
        return (km / 100) * (consumMediu + extra);
    }
}
