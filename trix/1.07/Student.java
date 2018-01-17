
class Student {

    private String name;
    private double totalQuizScore;
    private int numberOfQuizes;

    public Student (String navn, double totalQuizScore, int numberOfQuizzes) {
        name = navn;
        totalQuizScore = totalQuizScore;
        numberOfQuizes = numberOfQuizes;
    }


    public String getName() {
        return name;
    }


    public void addQuizScore(double score) {
        totalQuizScore = totalQuizScore + score;
        numberOfQuizes = numberOfQuizes + 1;
    }


    public double getTotalScore() {
        return totalQuizScore;
    }


    public double getAverageScore() {
        return (totalQuizScore / numberOfQuizes);
    }

}
