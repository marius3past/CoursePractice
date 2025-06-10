public class ContEconomii extends ContBancar {
    private double dobandaAnuala = 0.03;
    private int retrageriÎnAceastăLună;

    ContEconomii(String nrCont, String nume, double soldIntial, int retrageriÎnAceastăLună) {
        super(nrCont, nume, soldIntial);
        this.retrageriÎnAceastăLună = 0;
    }

    @Override
    public void retrage(double suma) {
        if (retrageriÎnAceastăLună >=1) {
            System.out.println(" Retragerea a esuat. Este posibila doar o retragere pe luna ");
        }
        else if (suma > 0 && suma <= sold) {
            retrageriÎnAceastăLună++;
            sold -= suma;
            System.out.println(" Retragerea completa. Noul sold este : " + sold);
        }
        else {
            System.out.println(" Retragerea nu a fost validata ");
        }
    }

    public void reseteazaÎnregistrăriLunare() {
        retrageriÎnAceastăLună = 0;
    }

    public void aplicaDobanda() {
        double interes = dobandaAnuala * sold;
        sold += interes;
        System.out.println("Interesul a fost aplicat cu succes. Noul sold este : " + sold);
    }

    @Override
    public void afiseazaInformatii() {
        System.out.println("Cont Economii ");
        super.afiseazaInformatii();
        System.out.println(" Retrageri in aceasta luna " + retrageriÎnAceastăLună);
    }
}