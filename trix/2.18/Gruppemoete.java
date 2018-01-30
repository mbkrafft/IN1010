import java.io.File;
import java.util.Scanner;


public class Gruppemoete {


    private String[] navn = new String[14];
    private boolean[] oppmoete = new boolean[14];
    private int studentNummer = 0;


    public Gruppemoete() {

    }


    public void lesInnNavnFraFil(File fil) throws Exception {

        Scanner scan = new Scanner(fil);

        while ((scan.hasNextLine()) && (studentNummer < navn.length)) {
            navn[studentNummer] = scan.nextLine();
            studentNummer ++;
        }
    }


    public void harMoett(String student) {

        for (int i = 0; i < studentNummer; i++) {
            if (student.equals(navn[i])) {
                oppmoete[i] = true;
            }
        }
    }


    public void skrivUtStudentInfo() {

        for (int i = 0; i < studentNummer; i++) {
            if (oppmoete[i] == true) {
                System.out.println(navn[i] + " møtte opp til gruppemøtet.");
            }
            else {
                System.out.println(navn[i] + " møtte ikke opp til gruppemøtet.");
            }
        }
    }
}
