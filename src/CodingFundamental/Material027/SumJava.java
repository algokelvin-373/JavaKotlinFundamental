package CodingFundamental.Material027;

public class SumJava {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int x = 0; x < a.length; x++) {
            sum += a[x];
        }
        System.out.println(sum);
    }
}
