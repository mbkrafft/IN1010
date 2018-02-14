


public class Rektangel implements Figur {


    private double hoyde;
    private double bredde;

    public Rektangel(double hoyde, double bredde) {

        this.hoyde = hoyde;
        this.bredde = bredde;

    }

    public double beregnAreal() {
        return this.hoyde * this.bredde;
    }

    public double beregnOmkrets() {
        return ((this.hoyde* 2) + (this.bredde * 2)) ;
    }
}
