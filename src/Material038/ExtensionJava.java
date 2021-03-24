package Material038;

public class ExtensionJava {
    public static void main(String[] args) {
        ExampleJava.extFunction(1);
    }
}
class ExampleJava {
    public static void extFunction(int x) {
        System.out.println("Extension "+x);
    }
}
