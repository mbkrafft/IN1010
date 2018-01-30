import java.io.File;
import java.util.Scanner;

public class Linjenummer {

    public static void main(String[] args) throws Exception {

        int teller = 1;

        File fil = new File("inputfil.txt");
        Scanner scan = new Scanner(fil);

        while (scan.hasNextLine()) {

            System.out.println("/* " + teller + " */ " + scan.nextLine());
            teller ++;
        }


    }


}
