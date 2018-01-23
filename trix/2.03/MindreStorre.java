import java.util.Scanner;

public class MindreStorre {

    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        
        System.out.print("Skriv inn ett tall: ");
        int tall = tastatur.nextInt();

        if ((tall > 10) && (tall < 20)) {
            System.out.println(tall + " er mellom 10 og 20.");
        }
        else if (tall < 10) {
            System.out.println(tall + " er  mindre enn 10");
        }
        else if (tall > 20) {
            System.out.println(tall + " er størret enn 20.")
        }

    }
}
