package Material036;

public class ParameterFunctionJava {
    public static void main(String[] args) {
        callMethod(1);
        callMethod(1, 2);
    }
    public static void callMethod(int x) {
        System.out.println("Method "+x);
    }
    public static void callMethod(int x, int y) {
        System.out.println("Method "+x+" and Method "+y);
    }
}
