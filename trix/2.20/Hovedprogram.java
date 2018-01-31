import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class Hovedprogram {


    public static void main(String[] args) throws Exception {

        // lager lister til både personer og hunder
        ArrayList<Person> personer = new ArrayList<Person>();
        ArrayList<Hund> hunder = new ArrayList<Hund>();

        // scanner fil med navn
        File fil = new File("navn.txt");
        Scanner scan = new Scanner(fil);

        String sjekk;

        // går over alle navn i filen og legger inn i listene
        while (scan.hasNextLine()) {

            sjekk = scan.next();

            if (sjekk.equals("P")) {
                personer.add(new Person(scan.nextLine()));
            }
            else if (sjekk.equals("H")) {
                hunder.add(new Hund(scan.nextLine()));
            }
            else {
                System.out.println("feil");
            }
        }


        // skriver ut info om personer
        System.out.println("Personer:");
        for (Person p : personer) {
            System.out.println(p.hentNavn());
        }
        System.out.println("");


        // skriver ut info om hunder
        System.out.println("Hunder:");
        for (Hund h : hunder) {
            System.out.println(h.hentNavn());
        }
    }
}
