class EspressoMaskin {

    private int antallmLIgjen = 0;
    private int maksVannmL = 1000;

    public EspressoMaskin(int mLFraStart) {

        antallmLIgjen = mLFraStart;
    }


    // Lag espresso dersom det er nok vann
    public void lagEspresso() {

        int espressoMengde = 40;

        if (antallmLIgjen >= espressoMengde) {
            antallmLIgjen -= espressoMengde;
            System.out.println("Espresso ble laget.");
        }
        else {
            System.out.println("Det er ikke nok vann igjen i maskinen.");
        }
    }

    // Lag lungo dersom det er nok vann
    public void lagLungo() {

        int lungoMengde = 110;

        if (antallmLIgjen >= lungoMengde) {
            antallmLIgjen -= lungoMengde;
            System.out.println("Lungo ble laget.");
        }
        else {
            System.out.println("Det er ikke nok vann igjen i maskinen.");
        }
    }

    // Fyll på et gitt antall milliliter vann, dersom det er plass
    public void fyllVann(int ml) {

        if ((ml + antallmLIgjen) > maksVannmL) {
            System.out.println("Du prøver å fylle for mye vann.");
        }
        else {
            antallmLIgjen += ml;
            System.out.println("Du har fyllt på vann. Det er nå: " +
            antallmLIgjen + " mL igjen.");
        }
    }

    // Les av målestrekene på vanntanken og tilgjengelig vann i ml
    public int hentVannmengde() {

        return antallmLIgjen;
    }
}
