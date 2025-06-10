package problema4;

public class Test {
    public static void main(String[] args) {
        Masina masina = new Masina("JLM843", 12.5);
        System.out.println("La o distanta de 100 km camionul consuma :  " + masina.calculeazaConsum(200));

        Camion camion = new Camion("C100DCM", 25, 300);
        System.out.println("La o distanta de 300 km camionul consuma :  " + camion.calculeazaConsum(300));
    }
}
