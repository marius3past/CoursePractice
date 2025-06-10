package problema2;

public class Main1 {
    public static void main(String[] args) {
        AngajatFullTime a1 = new AngajatFullTime("Veronica", 7200, 15);
        AngajatPartTime a2 = new AngajatPartTime("Cristian", 30);

        a1.adaugaZileConcediuPlatite(15);
        System.out.println(a1.afiseazaInformatii());

        a2.adaugaOreLucrate(125);
        a2.adaugaDepartamente("Management");
        a2.adaugaDepartamente("IT");
        System.out.println(a2.afiseazaInformatii());
    }
}
