package Material050;

interface InterfaceJava {
    void message();
}
public class JavaInterface implements InterfaceJava {
    public static void main(String[] args) {
        JavaInterface javaInterface = new JavaInterface();
        javaInterface.message();
    }
    @Override
    public void message() {
        System.out.println("This is interface method");
    }
}
