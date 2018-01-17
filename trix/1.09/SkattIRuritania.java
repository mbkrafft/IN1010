import java.util.Scanner;


class SkattIRuritania {


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inntekt = 0.0;
        double skatt = 0.0;

        System.out.print("Skriv inn din inntekt: ");

        inntekt =  scanner.nextDouble();

        if (inntekt < 10000) {

            skatt = inntekt * 0.1;
        }
        else {

            skatt = ((10000 * 0.1) + ((inntekt - 10000) * 0.3));
        }

        System.out.println("Din inntekt er " + inntekt +
        ",- så du må betale " + skatt + ",- i skatt.");

    }

}
