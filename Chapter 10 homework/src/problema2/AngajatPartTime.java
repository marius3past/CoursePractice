package problema2;

import java.util.ArrayList;
import java.util.List;

public class AngajatPartTime extends Angajat{
    private int oreLucrate;
    private List <String> departamente;

    AngajatPartTime(String nume, double salariuPeOra) {
        super(nume, salariuPeOra);
        this.departamente = new ArrayList<>();
    }

    public void adaugaOreLucrate(int ore) {
        this.oreLucrate += ore;
    }

    public void adaugaDepartamente(String dep) {
      departamente.add(dep);
    }


    @Override
    public double calculeazaSalariu() {
        return salariuDeBaza * oreLucrate;
    }

    @Override
    public String afiseazaInformatii() {
        return "Angajat Part-Time " + nume +
                "\nOre Lucrate " + oreLucrate +
                "\nDepartamente " + departamente +
                "\nSalariu " + calculeazaSalariu();
    }
}
