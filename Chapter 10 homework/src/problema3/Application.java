package problema3;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List <Corpuri> corpuri = new ArrayList<>();

        corpuri.add(new Cerc(8, 3.14));
        corpuri.add(new Pătrat(12));
        corpuri.add(new Triunghi(8, 12));

        for (Corpuri corpuri1 : corpuri) {
            System.out.println("\nAria este " + corpuri1.getAria());
        }
    }
}
