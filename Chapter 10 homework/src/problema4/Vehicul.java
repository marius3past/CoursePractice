package problema4;

 abstract class Vehicul {
    protected String nrÎnmatriculare;
    protected double consumMediu;

    Vehicul(String nrÎnmatriculare, double consumMediu) {
        this.nrÎnmatriculare = nrÎnmatriculare;
        this.consumMediu = consumMediu;
    }

        public abstract double calculeazaConsum(double km);
}
