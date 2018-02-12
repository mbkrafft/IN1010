import java.util.Scanner;


public class Personbil extends Bil {

    int sitteplasser;

    public Personbil(String eiernavn) {
        super(eiernavn);
        this.aarsavgift = 3000;
    }

    @Override
    public void lesInnData() {
        super.lesInnData();

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Skriv inn antall sitteplasser i bilen din: ");
        this.sitteplasser = tastatur.nextInt();
    }

    @Override
    public void skrivUtData() {
        super.skrivUtData();
        System.out.println(this.sitteplasser);
        System.out.println(this.aarsavgift);
    }

}
