package problema4;

public class Masina extends Vehicul {

    Masina(String nrÎnmatriculare, double consumMediu) {
        super(nrÎnmatriculare, consumMediu);
    }

    @Override
    public double calculeazaConsum(double km) {
        return (km / 100.0) * consumMediu;
    }
}
