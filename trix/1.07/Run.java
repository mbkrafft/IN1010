
class Run {

    public static void main (String[] args) {

        Student joakim = new Student("Joakim", 0, 0);
        Student kristin = new Student("Kristin", 0, 0);
        Student dag = new Student("Dag", 0, 0);

        joakim.addQuizScore(100);
        joakim.addQuizScore(100);

        kristin.addQuizScore(90);
        kristin.addQuizScore(90.1);

        dag.addQuizScore(10);
        dag.addQuizScore(15);

        System.out.println("Navn: " + joakim.getName());
        System.out.println("Total score: " + joakim.getTotalScore() +
        ". Gjennomsnittlig score:" + joakim.getAverageScore());

        System.out.println(kristin.getName());
        System.out.println("Total score: " + kristin.getTotalScore() +
        ". Gjennomsnittlig score:" + kristin.getAverageScore());

        System.out.println(dag.getName());
        System.out.println("Total score: " + dag.getTotalScore() +
        ". Gjennomsnittlig score:" + dag.getAverageScore());

    }



}
