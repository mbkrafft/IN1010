


class Rektangel extends Figur {

    private double hoyde;
    private double bredde;


    public Rektangel(double h, double b) {

        hoyde = h;
        bredde = b;
    }


    public double areal() {
        
        return (hoyde * bredde);
    }
}
