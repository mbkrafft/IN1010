import java.util.HashMap;
import java.util.Scanner;


public class FinnStudent {

    public static void main(String[] args) {

        // legger til studenter i HashMap
        HashMap<String, String> student = new HashMap<>();
        student.put("1", "Espen Askeladd");
        student.put("2", "Jens");
        student.put("3", "Per");
        student.put("4", "Pål");

        System.out.println(student);

        // Output basert på om vi finner navnet eller ikke
        if (finnNavn(student)) {
            System.out.println("Fant navnet!");
        }
        else {
            System.out.println("Fant ikke navnet.");
        }
    }

    public static boolean finnNavn(HashMap student) {

        // lar bruker taste inn hvilket navn vi leter etter
        System.out.print("Skriv navn du leter etter: ");
        Scanner tastatur = new Scanner(System.in);
        String navn = tastatur.next();

        return student.containsValue(navn);
    }
}
