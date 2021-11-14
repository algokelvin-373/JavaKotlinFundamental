package CodingCaseStudy.ArrayManagement;

import static java.util.Arrays.copyOfRange;

public class ArrayManagementJava {
    public static void main(String[] args) {
        int[] x = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] y1 = copyOfRange(x, 0, 4);
        int[] z = {100, 200, 300, 400, 500};
        int[] y2 = copyOfRange(x, 4, x.length);

        int[] y = new int[y1.length + z.length + y2.length];
        System.arraycopy(y1, 0, y, 0, y1.length);
        System.arraycopy(z, 0, y, y1.length, z.length);
        System.arraycopy(y2, 0, y, y1.length + z.length, y2.length);

        for (int value : y) {
            System.out.print(value + "-");
        }
    }
}
