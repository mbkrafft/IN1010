import java.util.ArrayList;



public class BachelorStudent extends Student {


    public Boolean tilgangSted;

    public BachelorStudent(String navn, int alder, ArrayList<String> kurs, String sted) {
        super(navn, alder, kurs, sted);
        this.tilgangSted = false;

    }



}
