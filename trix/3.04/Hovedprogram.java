


public class Hovedprogram {


    public static void main(String[] args) {

        Trekant t = new Trekant(3);
        Sirkel s = new Sirkel(3);
        Rektangel r = new Rektangel(7, 3);
        Kvadrat k = new Kvadrat(4);


        double sum = t.areal() + s.areal() + r.areal() + k.areal();

        System.out.println(sum);
    }
}
