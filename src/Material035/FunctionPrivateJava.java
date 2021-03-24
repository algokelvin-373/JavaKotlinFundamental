package Material035;

public class FunctionPrivateJava {
    public static void main(String[] args) {
        Method01 method01 = new Method01();
        // method01.setFunctionPrivate(); // You can't call this
        method01.getFunctionPrivate();
    }
}
class Method01 {
    private void setFunctionPrivate() {
        System.out.println("You call function private");
    }
    public void getFunctionPrivate() {
        setFunctionPrivate();
    }
}
