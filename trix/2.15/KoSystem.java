import java.util.ArrayList;

public class KoSystem{

    KoLapp lapp;
    ArrayList<KoLapp> koLappListe = new ArrayList<KoLapp>;
    int teller = 0;

    //Lager et nytt objekt av KoLapp, printer ut informasjon om den og legger den til i listen over koLapper.
    public void trekkKoLapp(){

        this.lapp = new KoLapp;

        System.out.println(this.lapp.hentNummer());

        koLappListe[teller] = this.lapp;
        teller ++;
    }

    //Henter ut, printer ut informasjon og fjerner den forste kolappen i lista. Gir feilmelding dersom ingen kunder staar i ko.
    public void betjenKunde(){

        
    }


    //Returnerer antall kunder som er i ko.
    public int antKunder(){

        int antall;

        for (KoLapp lapp : koLappListe) {
            if (lapp != null) {
                antall ++;
            }
        }

        return antall;
    }


    //Printer alle kunder i ko
    public void printKunderIKo(){

        for (KoLapp lapp : koLappListe) {
            System.out.println(lapp.hentNummer);
        }
    }

}
