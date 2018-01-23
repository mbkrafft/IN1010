
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class TemperaturLeser {

    public static void main(String[] args) throws Exception {

        String[] minListe = new String[12];

        File fil =  new File("temp.txt");
        Scanner scan = new Scanner(fil);

        int teller = 0;
        while (scan.hasNextLine()) {
            minListe[teller] = scan.nextLine();
            teller ++;
        }

        for (String temp : minListe) {
            System.out.println(temp);
        }
    }
}
