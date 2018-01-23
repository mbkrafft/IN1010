import java.util.ArrayList;

public class Brev {

    private String avsender;
    private String mottaker;
    private ArrayList<String> linjer;


    public Brev(String avsender, String mottaker) {
        this.avsender = avsender;
        this.mottaker = mottaker;
        linjer = new ArrayList<String>();
    }

    public void skrivLinje(String linje) {
        linjer.add(linje);
    }

    public void lesBrev(){
        System.out.println("Hei, " + this.mottaker);
        for (String linje : linjer) {
            System.out.println(linje);
        }
        System.out.println("Hilsen fra " + this.avsender);
    }
}
