import java.util.Scanner;


public class Varebil extends Bil {

    int lastevekt;

    public Varebil(String eiernavn) {
        super(eiernavn);
        this.aarsavgift = 4 * this.lastevekt;
    }

    @Override
    public void lesInnData() {
        super.lesInnData();

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Skriv inn total lastevekt til bilen din: ");
        this.lastevekt = tastatur.nextInt();
    }

    @Override
    public void skrivUtData() {
        super.skrivUtData();
        System.out.println(this.lastevekt);
        System.out.println(this.aarsavgift);
    }

}
