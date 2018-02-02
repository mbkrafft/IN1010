import java.util.ArrayList;



public class MasterStudent extends Student {


    public Boolean tilgangSted;

    public MasterStudent(String navn, int alder, ArrayList<String> kurs,
    String sted) {
        super(navn, alder, kurs, sted);
        this.tilgangSted = true;

    }


}
