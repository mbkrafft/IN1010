


public class Sirkel implements Figur {


    private double radius;

    public Sirkel(double radius) {

        this.radius = radius;

    }

    public double beregnAreal() {
        return (Math.PI * radius * radius);
    }

    public double beregnOmkrets() {
        return (2 * Math.PI * radius);
    }
}
