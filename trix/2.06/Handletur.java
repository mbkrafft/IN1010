import java.util.HashMap;
import java.util.Scanner;

public class Handletur {

    public static void main(String[] args) {

        int total = 0;
        int pris = 0;

        HashMap<String, Integer> varer = new HashMap<String, Integer>();
        varer.put("Brød", 20);
        varer.put("Melk", 15);
        varer.put("Ost", 40);
        varer.put("Yoghurt", 12);

        Scanner tastatur = new Scanner(System.in);

        for (String vare : varer.keySet()) {
            System.out.println("Hvor mange " + vare + " vil du ha? ");
            pris = tastatur.nextInt();
            total += (pris * varer.get(vare));
        }

        System.out.println("Du må betale: " + total + ",-");

    }
}
