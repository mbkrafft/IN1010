import java.util.Scanner;
import java.io.File;

public class FraFil {

    public static void main(String[] args) throws Exception {


        File fil =  new File("tekst.txt");
        Scanner scan = new Scanner(fil);

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }
}
