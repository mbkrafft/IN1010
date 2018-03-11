


public class Main {

    public static void main(String[] args) {

        Parkeringsplass<Bil> biler = new Parkeringsplass<>();
        Parkeringsplass<Bil> motor = new Parkeringsplass<>();

        Bil bil = new Bil(123, 5);
        Motorsykkel moto = new Motorsykkel(321, 125);

        biler.parker(bil);


        // kan ikke parkere motorsykkel i bilparkeringsplass:
        // error: incompatible types: Motorsykkel cannot be converted to Bil
        // biler.parker(moto);
    }
}
