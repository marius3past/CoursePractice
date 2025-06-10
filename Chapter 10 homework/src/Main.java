public class Main {
    public static void main(String[] args) {
        ContCurent curent = new ContCurent(" 432908934820", "Ludmila ", 500);
        curent.retrage(470);
        curent.depune(200);
        curent.afiseazaInformatii();


        ContEconomii economii = new ContEconomii("82034980239808", "Mihai", 820, 1);
        economii.aplicaDobanda();
        economii.retrage(430);
        economii.retrage(200);
        economii.afiseazaInformatii();

        economii.reseteazaÎnregistrăriLunare();
        economii.retrage(200);
    }
}