


public class Parkeringsplass<E> {

    private E kjoretoy;

    public void parker(E kjorteoy) {
        this.kjoretoy = kjoretoy;
    }

    public E hent() {
        E tmp = this.kjoretoy;
        this.kjoretoy = null;
        return tmp;
    }

}
