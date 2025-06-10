public class ContCurent extends ContBancar{

    ContCurent(String nrCont, String nume, double soldInital) {
        super(nrCont, nume, soldInital);
    }

    @Override
    public void retrage(double suma) {

        if (sold - suma < 50) {
            System.out.println(" Retragerea nu este posibila. Soldul minim nu trebuie sa fie mai mic de 50 RON. ");
        }
        else {
            sold -= suma;
            System.out.println(" Retragerea a fost efectuata cu succes. Noul sold : " + sold);
        }
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println(" Cont curent ");
        super.afiseazaInformatii();
        System.out.println(" Soldul curent " + sold);
    }
}