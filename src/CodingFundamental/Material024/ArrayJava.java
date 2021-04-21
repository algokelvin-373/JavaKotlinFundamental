package CodingFundamental.Material024;

public class ArrayJava {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int x = 0; x < a.length; x++) {
            a[x] = x+1;
        }
        System.out.println(a);
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x]+" ");
        }
        System.out.println();
    }
}
