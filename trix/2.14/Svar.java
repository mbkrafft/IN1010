import java.util.HashMap;

public class Svar {

    public static void main(String[] args) {

        HashMap<String, Student> studenter = new HashMap<String, Student>();
        studenter.put("Mathias", new Student("Mathias", 23));
        studenter.put("Per", new Student("Per", 20));
        studenter.put("Pål", new Student("Pål", 25));


        // itererer over nøkler
        for (String key : studenter.keySet()) {
            System.out.println(key);
        }

        // itererer over verdier
        for (Student student : studenter.values()) {
            System.out.println(student.toString());
        }




    }




}
