package problema2;

public class AngajatFullTime extends Angajat {
    private double bonus;
    private int zileConcediuPlatite;


    AngajatFullTime(String nume, double salariuDeBaza, double bonus) {
        super(nume, salariuDeBaza);
        this.bonus = bonus;
    }

    @Override
    public double calculeazaSalariu() {
        return salariuDeBaza + bonus;
    }

    public void adaugaZileConcediuPlatite(int zile) {
        this.zileConcediuPlatite += zile;
    }

    public void scadeZileConcediuPlatite(int zile) {
        this.zileConcediuPlatite -= zile;
    }

    @Override
    public String afiseazaInformatii() {

            return "Angajat Full-Time: " + nume +
                    "\nSalariu: " + calculeazaSalariu() +
                    "\nZile concediu platite: " + zileConcediuPlatite;
        }
    }

