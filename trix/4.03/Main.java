import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        ArrayList<String> mathiasKurs = new ArrayList<String>();
        mathiasKurs.add("IN1010");
        mathiasKurs.add("IN1080");
        mathiasKurs.add("IN1030");

        BachelorStudent bs = new BachelorStudent("Mathias", 23, mathiasKurs,
        "UiO");

        bs.skrivInfo();


        Professor p = new Professor("Jens", 53, 300.0, "Informatikk", "IN1010");
        p.skrivInfo();
    }
}
