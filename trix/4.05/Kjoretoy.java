import java.util.Scanner;


public abstract class Kjoretoy implements InnUtData {

    String registreringsnummer;
    String fabrikkmerke;
    String eiernavn;

    public Kjoretoy(String eiernavn) {
        this.eiernavn = eiernavn;
        lesInnData();
    }

    @Override
    public void lesInnData() {
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Skriv inn fabrikkmerke på bussen din: ");
        this.fabrikkmerke = tastatur.nextLine();

        System.out.print("Skriv inn registreringsnummeret på bussen din: ");
        this.registreringsnummer = tastatur.nextLine();
    }

    @Override
    public void skrivUtData() {
        System.out.println(this.eiernavn);
        System.out.println(this.registreringsnummer);
        System.out.println(this.fabrikkmerke);
    }

}
