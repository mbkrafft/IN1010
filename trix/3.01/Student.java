import java.util.ArrayList;


public class Student {

    public String navn;
    public ArrayList<Fag> fagSomStudentenTar = new ArrayList<Fag>();


    public Student(String navn) {

        this.navn = navn;
    }


    public String hentNavn() {

        return this.navn;
    }


    public void leggTilFag(Fag f) {

        fagSomStudentenTar.add(f);
    }
}
