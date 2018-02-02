import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.PrintWriter;

public class StudentSystem {

    // HashMap som tar fag som nøkkel og liste over studenter som tar
    // faget som verdi
    HashMap<Fag, ArrayList<Student>> oversikt =
    new HashMap<Fag, ArrayList<Student>>();

    // liste over alle studenter som tar fag
    ArrayList<Student> alleStudenter = new ArrayList<Student>();

    Scanner tastatur = new Scanner( System.in);


    // validerer at man kan opprette en scanner over filen man selv har oppgitt
    private Scanner skrivInnFilNavn() {

        System.out.print("Skriv inn filnavn: ");
        try {
            String filnavn = tastatur.nextLine();
            File fil = new File(filnavn);
            return new Scanner(fil);
        }
        catch (Exception e) {
            System.out.println("Skriv inn et gyldig filnavn.");
            return skrivInnFilNavn();
        }
    }


    // leser inn informasjon fra en fil som man selv oppgir
    public void lesFraFil() throws Exception {

        Fag detteFaget = null;

        // liste med studentobjekter som tar faget
        ArrayList<Student> fagetsStudenter = null;

        // lese og bruke info fra fil
        Scanner scan = skrivInnFilNavn();

        // variabler som trengs får å legge til nye studenter og fag riktig
        String fagkode = "";
        String studentNavn = "";
        String linje = "";
        Boolean nyStudent = true;
        Student opprettetStudent = null;

        while (scan.hasNextLine()) {

            linje = scan.nextLine();

            // finner fag og studentnavn, legger inn i hashmap
            if (linje.startsWith("*")) {
                fagkode = linje;
                detteFaget = new Fag(fagkode);
                fagetsStudenter = new ArrayList<Student>();

                // lager nytt fag og liste i hashmap
                oversikt.put(detteFaget, fagetsStudenter);

                // resetter studentNavn for ikke å legge inn forrige student
                // i nytt fag
                studentNavn = "";
            }
            else {
                studentNavn = linje;
            }

            // går igjennom alle studenter vi allerede har opprettet
            for (Student s : alleStudenter) {
                // studenten finnes fra før
                if (s.hentNavn().equals(studentNavn)) {
                    nyStudent = false;
                    opprettetStudent = s;
                    break;
                }
                // studenten finnes ikke fra før
                else {
                    nyStudent = true;
                }
            }

            // legger inn student som tar faget
            if ((studentNavn != "") && (fagkode != "")) {
                // lager ny student hvis ikke allerede opprettet
                if (nyStudent) {
                    opprettetStudent = new Student(studentNavn);
                    oversikt.get(detteFaget).add(opprettetStudent);
                    opprettetStudent.leggTilFag(detteFaget);
                    alleStudenter.add(opprettetStudent);
                }
                // legger til fag til student som finnes ellers
                else {
                    oversikt.get(detteFaget).add(opprettetStudent);
                    opprettetStudent.leggTilFag(detteFaget);
                }
            }
        }
    }


    // gir det faget som har flest studenter
    private Fag fagMedFlestStudenter() {

        Fag fagMedFlestStudenter = null;

        int antallStudenter = 0;
        int teller = 0;

        // Går igjennom hvert fag, sjekker hvilket som har flest studenter
        for (Fag f : oversikt.keySet()) {
            teller = oversikt.get(f).size();
            if (teller > antallStudenter) {
                fagMedFlestStudenter = f;
            }
        }

        return fagMedFlestStudenter;
    }


    // gir den studenten som tar flest fag
    private Student studentMedFlestFag() {

        Student studentMedFlestFag = null;

        int antallFag = 0;
        int teller = 0;

        // Går igjennom alle studenter og sjekker antall fag de tar
        for (Student s : alleStudenter) {
            antallFag = s.fagSomStudentenTar.size();
            if (teller < antallFag) {
                studentMedFlestFag = s;
            }
        }

        return studentMedFlestFag;
    }


    // skriver ut alle studenter som tar et fage
    private void skrivStudenterMedFag(Fag f) {

        for (Student s : oversikt.get(f)) {
            System.out.println(s.hentNavn());
        }
    }


    // skriver ut alle fagene en student tar
    private void skrivFagTilStudent(Student s) {

        if (s.fagSomStudentenTar.size() == 0) {
            System.out.println(s.hentNavn() + " tar ingen fag.");
        }

        for (Fag f : s.fagSomStudentenTar) {
            System.out.println(f.hentFagkode());
        }
    }


    // legger til et nytt fag til en student. Legger både inn faget i student
    // objektets liste over fag, og fagets liste over studenter
    private void studentNyttFag(Student s, Fag f) {

        Boolean leggTil = true;

        for (Fag fag : s.fagSomStudentenTar) {
            if (f.equals(fag)) {
                System.out.println(s.hentNavn() + " tar allerede "
                + f.hentFagkode());
                leggTil = false;
            }
        }

        if (leggTil) {
            System.out.println("Legger til " + f.hentFagkode() + " til listen"
            + " over fag som" + s.hentNavn() + " tar.");
            oversikt.get(f).add(s);
            s.leggTilFag(f);
        }
    }


    // fjerner et fag fra en student. Fjerne både fra fagobjektets liste over
    // studenter, og fra studentobjektets liste over fag
    private void studentFjernFag(Student s, Fag f) {

        oversikt.get(f).remove(s);
        s.fagSomStudentenTar.remove(f);
    }


    // legger til en helt ny student i listen over studenter
    private void leggTilNyStudent(Student s) {

        alleStudenter.add(s);
    }


    // legger til et helt nytt fag i hashmap oversikt
    private void leggTilNyttFag(Fag f) {

        ArrayList<Student> fagetsStudenter = new ArrayList<Student>();
        oversikt.put(f, fagetsStudenter);
    }


    // avslutter programmet
    private Boolean avsluttProgram() {

        return false;
    }


    // skriver ut valgmulighetene man har
    private void skrivStudentSystemMeny() {

        System.out.println(" ");
        System.out.println("Velkommen til studentsystemet.");
        System.out.println("Tast 1: Finn ut hvilket fag som blir tatt" +
        " av flest studenter.");
        System.out.println("Tast 2: Finn ut hvilken student som" +
        " tar flest fag.");
        System.out.println("Tast 3: Skriv ut alle studenter som tar faget.");
        System.out.println("Tast 4: Skriv ut alle fag studenten tar.");
        System.out.println("Tast 5: Legg til et nytt fag for en student / " +
        "legg til en ny student til et fag.");
        System.out.println("Tast 6: Fjern en student fra et fag / " +
        "fjern et fag fra en student.");
        System.out.println("Tast 7: Legg til en ny student.");
        System.out.println("Tast 8: Legg til et nytt fag.");
        System.out.println("Tast 9: Avslutt program.");
        System.out.println("Tast 10: List opp alle studenter.");
        System.out.println("Tast 11: List opp alle fag.");
    }


    // sjekker alle tilgjenglige fag
    private Fag sporOmFag() {

        int teller = 0;
        int valg = 0;

        ArrayList<Fag> fag = new ArrayList<Fag>();

        System.out.println("Hvilket fag?");
        for (Fag f : oversikt.keySet()) {
            teller ++;
            System.out.println("Tast " + teller +
            " for " + f.hentFagkode() + ".");
            fag.add(f);
        }

        try {
            valg = sporOmTall();
        }
        catch (Exception e) {
            System.out.println("Skriv inn gyldig verdi.");
            valg = 0;
        }

        try {
            return fag.get(valg - 1);
        }
        catch (Exception e) {
            return sporOmFag();
        }
    }


    // sjekker alle fag som studenten tar
    private Fag sporOmFag(Student s) {

        int teller = 0;
        int valg = 0;

        ArrayList<Fag> fag = new ArrayList<Fag>();

        System.out.println("Hvilket fag?");
        for (Fag f : s.fagSomStudentenTar) {
            teller ++;
            System.out.println("Tast " + teller +
            " for " + f.hentFagkode() + ".");
            fag.add(f);
        }

        try {
            valg = sporOmTall();
        }
        catch (Exception e) {
            System.out.println("Skriv inn gyldig verdi.");
            valg = 0;
        }

        try {
            return fag.get(valg - 1);
        }
        catch (Exception e) {
            return sporOmFag(s);
        }
    }


    // spør om tall, helt til et tall som man kan velge blir oppgitt
    private int sporOmTall() {
        int valg;
        System.out.print("Du taster: ");
        valg = tastatur.nextInt();
        return valg;
    }


    // spør om navn, helt til et navn som allerede finnes blir oppgitt
    private Student sporOmStudent() {

        System.out.print("Hvilken student: ");

        String navn = tastatur.nextLine();

        // sjekker om riktig navn
        for (Student s : alleStudenter) {
            if (navn.equals(s.hentNavn())) {
                return s;
            }
        }
        // kjører metoden igjen dersom vi ikke finner riktig navn
        System.out.println("Skriv inn et gyldig navn.");
        return sporOmStudent();
    }


    // holder programmet gående
    public void ordrelokke() {

        Boolean fortsett = true;
        int valg;

        while (fortsett) {

            Fag fag = null;
            Student student = null;

            skrivStudentSystemMeny();

            try {
                System.out.print("Skriv inn valg: ");
                valg = tastatur.nextInt();
            }
            catch (Exception e) {
                valg = -1;
            }


            switch (valg) {
                case 1:
                    System.out.println(fagMedFlestStudenter().hentFagkode());
                    break;
                case 2:
                    System.out.println(studentMedFlestFag().hentNavn());
                    break;
                case 3:
                    fag = sporOmFag();
                    System.out.println("Følgende studenter tar " +
                    fag.hentFagkode() + ":");
                    skrivStudenterMedFag(fag);
                    break;
                case 4:
                    student = sporOmStudent();
                    skrivFagTilStudent(student);
                    break;
                case 5:
                    student = sporOmStudent();
                    fag = sporOmFag();
                    studentNyttFag(student, fag);
                    break;
                case 6:
                    student = sporOmStudent();
                    fag = sporOmFag(student);
                    studentFjernFag(student, fag);
                    break;
                case 7:
                    Boolean leggTilStudent = true;
                    System.out.println("Hva heter studenten?");
                    System.out.print("Skriv inn navn: ");
                    String navn = tastatur.nextLine();
                    for (Student s : alleStudenter) {
                        if (navn.equals(s.hentNavn())) {
                            System.out.println("Dette navnet ligger allerede"
                            + " inne i listen over studenter."  +
                            " Prøv igjen med annet nytt navn.");
                            leggTilStudent = false;
                        }
                    }
                    if (leggTilStudent) {
                        leggTilNyStudent(new Student(navn));
                        System.out.println("Ny student lagt til.");
                    }
                    break;
                case 8:
                    Boolean leggTilFag = true;
                    System.out.println("Hva er fagkoden?");
                    System.out.print("Skriv inn fagkode: ");
                    String fagkode = tastatur.nextLine();
                    for (Fag f : oversikt.keySet()) {
                        if (fagkode.equals(f.hentFagkode())) {
                            System.out.println("Denne fagkoden ligger" +
                            " allerede inne i listen over fag." +
                            " Prøv igjen med en annen fagkode.");
                            leggTilFag = false;
                        }
                    }
                    if (leggTilFag) {
                        leggTilNyttFag(new Fag("*" + fagkode));
                        System.out.println("Nytt fag lagt til.");
                    }
                    break;
                case 9:
                    fortsett = avsluttProgram();
                    break;
                case 10:
                    for (Student s : alleStudenter) {
                        System.out.println(s.hentNavn());
                    }
                    break;
                case 11:
                    for (Fag f : oversikt.keySet()) {
                        System.out.println(f.hentFagkode());
                    }
                    break;
                default:
                    System.out.println("Tast inn gyldig verdi.");
                    break;

            }
        }
    }


    // skriver ut all informasjon om både studenter og fag til valgfri fil
    public void skrivTilFil() throws Exception {

        System.out.print("Skriv filnavnet du vil skrive til: ");
        String filnavn = tastatur.nextLine();

        PrintWriter writer = new PrintWriter(filnavn, "UTF-8");
        for (Fag f : oversikt.keySet()) {
            writer.println(f.hentFagkode());
            for (Student s : oversikt.get(f)) {
                writer.println(s.hentNavn());
            }
        }
        writer.close();
    }
}
