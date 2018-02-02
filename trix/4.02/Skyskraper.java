


public class Skyskraper extends Bygning {

    double bruttoAreal;
    int antallEtasjer;

    public Skyskraper(double bruttoAreal, int antallEtasjer) {
        super(bruttoAreal);

        this.bruttoAreal = bruttoAreal;
        this.antallEtasjer = antallEtasjer;

        System.out.println("Dette er en skyskraper");
        System.out.println("Areal: " + this.bruttoAreal  +", Etasjer: " +
        this.antallEtasjer);
    }
}
