import java.util.Scanner;

public class Differanse {

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        // finner x verdien
        System.out.print("Oppgi verdien til x: ");
        int x = tastatur.nextInt();

        // finner y verdien
        System.out.print("Oppgi verdien til y: ");
        int y = tastatur.nextInt();

        // finner differanse
        System.out.println("Differansen mellom x og y er: " + (x - y));
    }

}
