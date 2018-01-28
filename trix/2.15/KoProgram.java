import java.util.Scanner;



public class KoProgram {

    public static void main(String[] args) {

        KoSystem system = new KoSystem();
        boolean fortsett = true;

        while (fortsett) {

            Scanner scan = new Scanner(System.in);

            System.out.println();
            System.out.println("MENY FOR BILLETTSYSTEM");

            System.out.println("1 - Trekk ny kølapp");
            System.out.println("2 - Betjen kunde");
            System.out.println("3 - Print antall kunder i kø");
            System.out.println("4 - Avslutt");

            System.out.print("Du tastet: ");
            int tall = scan.nextInt();
            System.out.println();

            switch (tall) {
                case 1:
                    system.trekkKoLapp();
                    system.antKunder();
                    break;
                case 2:
                    system.betjenKunde();
                    break;
                case 3:
                    system.antKunder();
                    break;
                case 4:
                    System.out.println("Du avslutter programmet.");
                    fortsett = false;
            }
        }
    }
}
