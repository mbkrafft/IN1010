
import java.util.ArrayList;
import java.util.Arrays;

public class Baathus {

    private Baat[] baatListe;

    public Baathus(int antallPlasser) {

        this.baatListe = new Baat[antallPlasser];
    }


    public boolean settInn(Baat b) {

        for (int i = 0; i < this.baatListe.length; i++) {
            if (baatListe[i] == null) {
                baatListe[i] = b;
                return true;
            }
        }
        System.out.println("Det er ikke flere plasser igjen");
        return false;
    }


    public void skrivBaater() {

        for (Baat b : baatListe) {
            System.out.println(b.hentInfo());
        }
    }

}
