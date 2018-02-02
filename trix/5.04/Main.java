


public class Main {


    public static void main(String[] args) {

        PasoFino pf = new PasoFino("Grace", 11);
        pf.toelt();
        pf.skritt();
        pf.trav();
        pf.galopp();

        Islandshest ih = new Islandshest("Mathias", 5);
        ih.toelt();
        ih.pass();
        ih.skritt();
        ih.trav();
        ih.galopp();

        EngelskFullblodshest ef = new EngelskFullblodshest("Tommy", 3);
        ef.skritt();
        ef.trav();
        ef.galopp();
    }
}
