class TestEspressoMaskin {


    public static void main(String[] args) {

        EspressoMaskin minMaskin = new EspressoMaskin(500);

        // Finner vannmengde
        System.out.println(minMaskin.hentVannmengde());

        // Tester at det ikke går å fylle for mye vann
        minMaskin.fyllVann(600);

        // Tester at både lungo og espresso blir lagd når det er nok vann
        minMaskin.lagLungo();
        minMaskin.lagEspresso();

        // Tester å fylle vann
        minMaskin.fyllVann(110);

        // Lager kaffe til tanken er tom
        minMaskin.lagLungo();
        minMaskin.lagLungo();
        minMaskin.lagLungo();
        minMaskin.lagLungo();

        // Tester at man får feilmelding når det ikke er nok vann
        minMaskin.lagLungo();
        minMaskin.lagEspresso();

        // Tester at man kan fylle med akkurat nok vann
        minMaskin.fyllVann(20);
        minMaskin.lagEspresso();

        // Tester at hentVannmengde funker med 0 vann igjen også
        System.out.println(minMaskin.hentVannmengde());
    }
}
