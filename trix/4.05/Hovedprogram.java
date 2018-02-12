import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;


public class Hovedprogram {

    static ArrayList<Kjoretoy> kjoretoy = new ArrayList<Kjoretoy>();

    public static void main(String[] args) {

        svarLoop();
    }

    private static void svarLoop() {
        Scanner tastatur = new Scanner(System.in);

        Boolean fortsett = true;


        while (fortsett) {

            String navn;
            String type;
            String svar;

            meny();

            System.out.print("Din input: ");
            svar = tastatur.nextLine();

            switch (svar) {
                case "0":
                    fortsett = false;
                    break;
                case "1":
                    valgKjoretoy();
                    break;
                case "2":
                    regNummer();
                    break;
                case "3":
                    avgift();
                    break;
                default:
                    System.out.println("Skriv en gyldig input.");
                    continue;
            }
        }
    }

    private static void avgift() {

        int total = 0;
        String eiernavn;

        Scanner tastatur = new Scanner(System.in);
        System.out.print("Skriv inn eiernavn: ");
        eiernavn = tastatur.nextLine();

        for (Kjoretoy k : kjoretoy) {
            if (k.eiernavn.equals(eiernavn)) {
                if (k instanceof Personbil) {
                    Personbil p = (Personbil) k;
                    total += p.aarsavgift;
                }
                else if (k instanceof Varebil) {
                    Varebil v = (Varebil) k;
                    total += v.aarsavgift;
                }
            }
        }

        System.out.println("Total årsavgift for " + eiernavn + " er: " + total);
    }


    private static void regNummer() {

        String regNummer;

        Scanner tastatur = new Scanner(System.in);
        System.out.print("Skriv inn regnummer: ");
        regNummer = tastatur.nextLine();

        for (Kjoretoy k : kjoretoy) {
            if (k.registreringsnummer.equals(regNummer)) {
                k.skrivUtData();
                return;
            }
        }

        System.out.println("Fant ikke regnummer, prøv igjen");
        return;
    }


    private static Kjoretoy valgKjoretoy() {

        Kjoretoy k;

        Boolean fortsett = true;

        while (fortsett) {

            String navn;
            String type;

            Scanner tastatur = new Scanner(System.in);

            System.out.print("Ditt navn: ");
            navn = tastatur.nextLine();

            menyKjoretoy();

            System.out.print("Type kjøretøy: ");
            type = tastatur.nextLine();

            switch (type) {
                case "1":
                    k = new Varebil(navn);
                    kjoretoy.add(k);
                    return k;
                case "2":
                    k = new Personbil(navn);
                    kjoretoy.add(k);
                    return k;
                case "3":
                    k = new Buss(navn);
                    kjoretoy.add(k);
                    return k;
                default:
                    System.out.println("Skriv inn gyldig input");
                    break;
            }
        }

        return null;
    }

    private static void menyKjoretoy() {
        System.out.println("1 - Varebil");
        System.out.println("2 - Personbil");
        System.out.println("3 - Buss.");
    }

    private static void meny() {
        System.out.println("0 - Avslutt");
        System.out.println("1 - Registrere nytt kjøretøy.");
        System.out.println("2 - Skrive ut informasjon til regnummer.");
        System.out.println("3 - Finn total aarsavgift.");
    }
}
