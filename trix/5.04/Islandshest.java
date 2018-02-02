


public class Islandshest extends Hest implements KanPasse, KanToelte {


    public Islandshest(String navn, int alder) {
        super(navn, alder);

    }

    public void toelt() {
        System.out.println(this.navn + " tølter");
    }

    public void pass() {
        System.out.println(this.navn + " passer");
    }
}
