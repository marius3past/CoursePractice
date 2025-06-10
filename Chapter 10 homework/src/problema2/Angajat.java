package problema2;

public class Angajat {
    protected String nume;
    protected double salariuDeBaza;

    Angajat(String nume, double salariuDeBaza) {
        this.nume = nume;
        this.salariuDeBaza = salariuDeBaza;
    }

    public double calculeazaSalariu() {
        return salariuDeBaza;
    }


    public String afiseazaInformatii() {
        return "Angajat: " + nume + ", Salariu de bază: " + salariuDeBaza;
    }

}
