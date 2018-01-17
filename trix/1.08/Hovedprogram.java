
class Hovedprogram {


    public static void main (String[] args) {

        Rektangel rek1 = new Rektangel(10.0, 5);
        Rektangel rek2 = new Rektangel(1, 1);


        System.out.println("Rek1 areal = " + rek1.areal());
        System.out.println("Rek2 areal = " + rek2.areal());

        rek1.oekBredde(5);
        rek2.oekLengde(1);

        System.out.println("Rek1 omkrets = " + rek1.omkrets());
        System.out.println("Rek2 omkrets = " + rek2.omkrets());


    }


}
