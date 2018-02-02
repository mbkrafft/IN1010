


public class Main {


    public static void main(String[] args) {
        B objekt1 = new B();
        A objekt2 = objekt1;

        objekt1.skrivKlasse();
        objekt2.skrivKlasse();


        /* 1
        Ser at skriver ut B i begge tilfeller. Dette er fordi objekt2 peker
        på et B - objekt, og vi bruker derfor B sin implementasjon av
        skrivKlasse-metoden
        */

        /* 2
        Siden vi forventer en metode skrivKlasse i A, og den ikke
        finnes, får vi en feil. Tross, vi ville brukte B sin implementasjon,
        så må metdoden finnes for å kunne overskrives.
        */

        /* 3
        Siden B arver fra A, og det ikke finnes en skrivKlasse i B lengre,
        bruker vi skrivKlasse-metdoden vi finner i A.
        */
    }
}
