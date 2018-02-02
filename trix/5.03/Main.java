


public class Main {


    public static void main(String[] args) {

        Planteeter[] planteetere = new Planteeter[2];
        Rovdyr[] rovdyr = new Rovdyr[2];

        rovdyr[0] = new Bjorn();
        rovdyr[1] = new Ulv();
        planteetere[0] = new Sau();
        planteetere[1] = new Elg();

        rovdyr[0].gaaPaaJakt();
        rovdyr[1].gaaPaaJakt();
        planteetere[0].beskytt();
        planteetere[1].beskytt();



    }

}
