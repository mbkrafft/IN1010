

import java.util.Arrays;

class HeltallsArray {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


        int[] mittArray = new int[5];
        int lengde = mittArray.length;

        for (int i = 0; i < lengde; i++) {
            mittArray[i] = i;
        }

        for (int i = 0; i < lengde; i++) {
            System.out.println(mittArray[i]);
        }
    }
}
