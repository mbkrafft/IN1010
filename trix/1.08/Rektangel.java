
class Rektangel {

    double lengde;
    double bredde;


    public Rektangel (double l, double b) {   // Konstruktør

        lengde = l;
        bredde = b;
    }


    public void oekLengde (int okning) {    // Oek lengden som angitt

        lengde = lengde + okning;
    }


    public void oekBredde (int okning) {    // Oek bredden som angitt

        bredde = bredde + okning;
    }


    public void reduserLengde (int reduser) {    // Oek lengden som angitt

        lengde = lengde - reduser;
    }


    public void reduserBredde (int reduser) {    // Oek bredden som angitt

        bredde = bredde + reduser;
    }


    public double areal () {     // Beregn mitt areal

        return (lengde * bredde);
    }


    public double omkrets () {   // Beregn min omkrets

        return ((lengde * 2) + (bredde * 2));
    }


}
