import java.util.ArrayList;


public class Student extends Person {

    public ArrayList<String> kurs = new ArrayList<String>();
    public String sted;

    public Student(String navn, int alder, ArrayList<String> kurs, String sted) {
        super(navn, alder);
        this.kurs = kurs;
        this.sted = sted;
    }

    public void skrivInfo() {
        System.out.print(this.navn + " er " +  this.alder +
        " år gammel, og går på " + this.sted + " og tar disse fagene: ");
        for (String s : this.kurs) {
            System.out.print(s + " ");
        }
        System.out.println("");
    }
}
