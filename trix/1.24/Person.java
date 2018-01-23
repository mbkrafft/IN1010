public class Person {

    String navn;
    int alder;


    public Person(String giNavn, int giAlder) {
        navn = giNavn;
        alder = giAlder;
    }

    public void giNavn(String n){
        navn = n;
    }

    public void giAlder(int a){
        alder = a;
    }
}
