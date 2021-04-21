package CodingFundamental.Material028;

import java.util.Arrays;
import java.util.Collections;

public class SortedJava {
    public static void main(String[] args) {
        Integer[] a = {32, 11, 25, 73, 44};
        Integer[] b = {32, 11, 25, 73, 44};

        System.out.println("Ascending");
        Arrays.sort(a);
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x]+" ");
        }
        System.out.println();

        System.out.println("Ascending");
        Arrays.sort(b, Collections.reverseOrder());
        for (int x = 0; x < b.length; x++) {
            System.out.print(b[x]+" ");
        }
        System.out.println();
    }
}
