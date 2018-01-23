
class Bil {

    private String eier;
    private String merke;


    public Bil(String eierAvBil, String bilMerke){

        eier = eierAvBil;
        merke = bilMerke;

    }

    public void skrivInfo() {

        System.out.println("Bilen, som er en " + merke + ", er eid av " + eier);
    }
}
