package Material049;

public class OverloadingJava {
    public static void main(String[] args) {
        OverloadJava overloadJava = new OverloadJava();
        overloadJava.method01("Java");
        overloadJava.method01("Java", "Kotlin");
    }
}
class OverloadJava {
    public void method01(String msg1) {
        System.out.println(msg1);
    }
    public void method01(String msg1, String msg2) {
        System.out.println(msg1+" "+msg2);
    }
}
