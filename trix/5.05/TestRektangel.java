


public class TestRektangel {


    public static void main(String[] args) {

        Rektangel r1 = new Rektangel(10, 30);
        testBeregnAreal(r1, 300);
        testBeregnOmkrets(r1, 80);

        Rektangel r2 = new Rektangel(0, 10);
        testBeregnAreal(r2, 0);
        testBeregnOmkrets(r2, 20);
    }

    public static void testBeregnAreal(Rektangel r, double svar) {

        if (r.beregnAreal() == svar) {
            System.out.println("beregnAreal OK.");
        }
        else {
            System.out.println("beregnAreal FEIL");
        }
    }

    public static void testBeregnOmkrets(Rektangel r, double svar) {

        if (r.beregnOmkrets() == svar) {
            System.out.println("beregnOmkrets OK.");
        }
        else {
            System.out.println("beregnOmkrets FEIL");
        }
    }
}
