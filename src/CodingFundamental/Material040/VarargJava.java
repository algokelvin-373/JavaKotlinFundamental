package CodingFundamental.Material040;

public class VarargJava {
    public static void main(String[] args) {
        showNumber(373); // 1 number
        showNumber(1, 2, 3, 4, 5); // 5 number
    }
    public static void showNumber(int ...x) {
        for (int i : x) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
