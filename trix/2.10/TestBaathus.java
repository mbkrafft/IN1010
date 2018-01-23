

public class TestBaathus {

    public static void main(String[] args) {

        Baathus mittBaathus = new Baathus(3);

        Baat baat1 = new Baat("Marna");
        Baat baat2 = new Baat("Mercury");
        Baat baat3 = new Baat("Fjordterne");
        Baat baat4 = new Baat("Windy");

        mittBaathus.settInn(baat1);
        mittBaathus.settInn(baat2);
        mittBaathus.settInn(baat3);
        mittBaathus.settInn(baat4);

        mittBaathus.skrivBaater();

    }
}
