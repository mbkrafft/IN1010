


public class TestSirkel {


    public static void main(String[] args) {

        Sirkel s1 = new Sirkel(10);
        testBeregnAreal(s1, (Math.PI * 10 * 10));
        testBeregnOmkrets(s1, (Math.PI * 2 * 10));

        Sirkel s2 = new Sirkel(0);
        testBeregnAreal(s2, 0);
        testBeregnOmkrets(s2, 0);
    }

    public static void testBeregnAreal(Sirkel s, double svar) {

        if (s.beregnAreal() == svar) {
            System.out.println("beregnAreal OK.");
        }
        else {
            System.out.println("beregnAreal FEIL");
        }
    }

    public static void testBeregnOmkrets(Sirkel s, double svar) {

        if (s.beregnOmkrets() == svar) {
            System.out.println("beregnOmkrets OK.");
        }
        else {
            System.out.println("beregnOmkrets FEIL");
        }
    }
}
