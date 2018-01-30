import java.io.File;


public class TestGruppemoete {

    public static void main(String[] args) throws Exception {

        Gruppemoete time1 = new Gruppemoete();

        File fil = new File("gruppeliste.txt");

        time1.lesInnNavnFraFil(fil);
        time1.harMoett("Ali");
        time1.harMoett("Lisa");
        time1.harMoett("Geir");
        time1.harMoett("Arne con Carne");
        time1.skrivUtStudentInfo();
    }


}
