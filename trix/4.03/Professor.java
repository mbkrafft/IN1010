


public class Professor extends Forsker {


    public String undervisningsKurs;

    public Professor(String navn, int alder, double timesLonn, String fagOmraade,
    String undervisningsKurs) {
        super(navn, alder, timesLonn, fagOmraade);
        this.undervisningsKurs = undervisningsKurs;

    }


    public void skrivInfo() {

        System.out.println(this.navn + " er " + this.alder +
        " år gammel og er proffesor i " + this.fagOmraade + " og underviser i "
        + this.undervisningsKurs + " for " + this.timesLonn +  ",- i timen");
    }

}
