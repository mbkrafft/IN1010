



public class Main {

    public static void main(String[] args) {


        Bygning s = new Skyskraper(100, 30);
        /* 1
        Kaller begge konstruktørene, fordi vi må må lage en instans av bygning
        objektet for å kunne lage et objekt av underklassen dens.
        */

        /* 2
        Her kaller vi eksplisitt på superklassen, det samme som skjer overfor,
        men her gjør vi det for å vise hva som skjer. Samme resultat.
        */


        /* 3
        Vi er nødt til å kalle super() med bruttoAreal som parameter inne i
        konstruktøren til Skyskraper.
        */

    }
}
