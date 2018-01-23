import java.util.Scanner;

public class Produkt {

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        // finner x verdien
        System.out.print("Oppgi verdien til x: ");
        int x = tastatur.nextInt();

        // finner y verdien
        System.out.print("Oppgi verdien til y: ");
        int y = tastatur.nextInt();

        // finner produkt
        System.out.println("Produktet til x og y er: " + (x * y));

        if ((x - y) > 0) {
            System.out.println("x er større en y.");
        }
        else if ((y - x) > 0) {
            System.out.println("y er større enn x.");
        }
        else {
            System.out.println("Differansen mellom x og y er 0.");
        }
    }

}
