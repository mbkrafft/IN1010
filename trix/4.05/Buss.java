import java.util.Scanner;


public class Buss extends Kjoretoy {

    int sitteplasser;

    public Buss(String eiernavn) {
        super(eiernavn);
    }

    @Override
    public void lesInnData() {
        super.lesInnData();

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Skriv inn antall sitteplasser i bussen din: ");
        this.sitteplasser = tastatur.nextInt();
    }

    @Override
    public void skrivUtData() {
        super.skrivUtData();
        System.out.println(this.sitteplasser);
    }


}
