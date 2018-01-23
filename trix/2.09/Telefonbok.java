import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Telefonbok {


    public static void main(String[] args) {

        Person p1 = new Person("Mathias", "12345678", "Hakkebakkeskogen");
        Person p2 = new Person("Per", "87654321", "IFI");
        Person p3 = new Person("Jens", "24681357", "Escape");

        /* Oppgave b)
        Person[] personListe = new Person[10];

        personListe[0] = p1;
        personListe[1] = p2;
        personListe[2] = p3;

        for (int i = 0; i < personListe.length; i++) {
            if (personListe[i] != null) {
                personListe[i].skrivInfo();
            }
        }
        */



        /* Oppgave c)
        ArrayList<Person> personListe = new ArrayList<Person>();

        personListe.add(p1);
        personListe.add(p2);
        personListe.add(p3);

        for (Person pers : personListe) {
                pers.skrivInfo();
        */



        // Oppgave d)
        HashMap<String, Person> personMap = new HashMap<String, Person>();

        personMap.put(p1.hentNavn(), p1);
        personMap.put(p2.hentNavn(), p2);
        personMap.put(p3.hentNavn(), p3);

        for (Person pers : personMap.values()) {
            pers.skrivInfo();
        }

        // Obs! Hvis to personer har likt navn, overskrives den første personen.
    }
}
