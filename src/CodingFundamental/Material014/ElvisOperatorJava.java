package CodingFundamental.Material014;

public class ElvisOperatorJava {
    public static void main(String[] args) {
        //In Java, Elvis looks like 'Ternary'
        String a = null;
        String msg = (a != null) ? "get "+a.length() : "null";
        System.out.println(msg);
    }
}
