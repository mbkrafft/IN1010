


public class PasoFino extends Hest implements KanToelte {


    public PasoFino(String navn, int alder) {
        super(navn, alder);

    }

    public void toelt() {
        System.out.println(this.navn + " tølter");
    }
}
