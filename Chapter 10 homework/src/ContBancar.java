public class ContBancar {
    private String nrCont;
    private String nume;
    protected double sold;

    ContBancar(String nrCont, String nume, double soldIntial) {
        this.nrCont = nrCont;
        this.nume = nume;
        this.sold = soldIntial;
    }

    public void depune(double suma) {
        if (suma > 0) {
            sold += suma;
            System.out.println("Depozit reusit. Noul sold : " + sold);
        }
        else {
            System.out.println("Depozitul nu este valid. ");
        }
    }

    public void retrage(double suma) {
        if (suma > 0 && suma <= sold) {
            sold -= suma;
            System.out.println("Retragere reusita. Noul sold : " + sold);
        }
        else {
            System.out.println("Retragerea a esuat. ");
        }
    }

    public String getNume() {
        return nume;
    }

    public String getNrCont() {
        return nrCont;
    }

    public void afiseazaInformatii() {
        System.out.println("Nume : " + getNume());
        System.out.println("Nr cont : " + getNrCont());
    }
}
