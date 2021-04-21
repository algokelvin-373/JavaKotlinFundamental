package CodingFundamental.Material009;

public class EqualityOperatorJava {
    public static void main(String[] args) {
        //Primitive Type
        int a = 5, b = 5, c = 10;
        String x = "algokelvin", y = "algokelvin", z = "algo";

        System.out.println((a == b)+" "+(a == c)); // true false
        System.out.println((x == y)+" "+(x == z)); // true false
        System.out.println(x.equals(y)+" "+(x.equals(z))); // true false
        //Equals is used only String type

        //Object Type
        Integer m = new Integer(10);
        Integer n = new Integer(10);
        Integer o = new Integer(5);

        System.out.println((m == n)+" "+(m == o)); // false false
        System.out.println((m.equals(n))+" "+(m.equals(o))); // true false
    }
}
