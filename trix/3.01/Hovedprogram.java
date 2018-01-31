import java.util.Scanner;


public class Hovedprogram {


    public static void main(String[] args) throws  Exception {

        StudentSystem ss = new StudentSystem();
        ss.lesFraFil();
        ss.ordrelokke();
        ss.skrivTilFil();


        // for (Fag f : ss.oversikt.keySet()) {
        //     System.out.println(f.hentFagkode());
        //     for (Student s : ss.oversikt.get(f)) {
        //         System.out.println(s.hentNavn());
        //     }
        // }
        // for (Student s : ss.alleStudenter) {
        //     System.out.println(s.hentNavn());
        // }
    }
}
