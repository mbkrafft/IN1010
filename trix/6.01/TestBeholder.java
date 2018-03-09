


class TestBeholder {

    public static void main(String[] args) {

        // tester at det funker for kvadratbeholder
        Beholder<Kvadrat> kvadratbeholder = new Beholder<>();
        kvadratbeholder.settInn(new Kvadrat(5));
        // tester at det funker for sirkelbeholder
        Beholder<Sirkel> sirkelbeholder = new Beholder<>();
        sirkelbeholder.settInn(new Sirkel(5));
    }
}
