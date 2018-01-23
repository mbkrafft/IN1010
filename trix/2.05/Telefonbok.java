import java.util.HashMap;
import java.util.Scanner;

public class Telefonbok {

    public static void main(String[] args) {

        // lager telefonboken
        HashMap<String, String> telefonbok = new HashMap<>();
        telefonbok.put("Arne Jens", "22334455");
        telefonbok.put("Lisa", "95959595");
        telefonbok.put("Jonas", "97959795");
        telefonbok.put("Peder", "12345678");

        String navn;
        boolean fortsettSok = true;

        System.out.println("Skriv 'q' for å slutte søk.");

        while (fortsettSok) {

            // lar bruker søke opp navn
            System.out.println("Skriv inn navn du vil søke opp: ");
            Scanner tastatur = new Scanner(System.in);
            navn = tastatur.nextLine();

            // sjekker navnet bruker har skrevet inn
            if (navn.equalsIgnoreCase("q")) {

                fortsettSok = false;
            }
            else if (telefonbok.containsKey(navn)) {
                System.out.println(navn + " har telefonnummeret: " +
                telefonbok.get(navn));
            }
            else {
                System.out.println("Navnet finnes ikke i telefonboken.");
            }
        }

        // gir oversikt over hele telefonboken
        System.out.println("Oversikt:");
        for (String telefonbokNavn : telefonbok.keySet()) {
            System.out.println(telefonbokNavn + " sitt telefonnummer er "
            + telefonbok.get(telefonbokNavn));
        }
    }
}
