import java.util.ArrayList;

public class KoSystem{

    KoLapp lapp;
    ArrayList<KoLapp> koLappListe = new ArrayList<KoLapp>();
    int teller = 1;

    public KoSystem() {

    }

    //Lager et nytt objekt av KoLapp, printer ut informasjon om den og legger den til i listen over koLapper.
    public void trekkKoLapp(){

        this.lapp = new KoLapp(teller);
        System.out.println("Kønummer: " + this.lapp.hentNummer());
        koLappListe.add(this.lapp);
        teller ++;
    }


    //Henter ut, printer ut informasjon og fjerner den forste kolappen i lista. Gir feilmelding dersom ingen kunder staar i ko.
    public void betjenKunde(){

        try {
            KoLapp kundeLapp = koLappListe.remove(0);
            System.out.println("Kunde med billetnummer " +
            kundeLapp.hentNummer() + " er betjent.");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Ingen flere i kø");
        }
    }


    //Returnerer antall kunder som er i ko.
    public int antKunder(){

        System.out.println("Det står " + koLappListe.size() + " personer i kø.");
        return koLappListe.size();
    }


    //Printer alle kunder i ko
    public void printKunderIKo(){

        for (KoLapp lapp : koLappListe) {
            System.out.println(lapp.hentNummer());
        }
    }

}
