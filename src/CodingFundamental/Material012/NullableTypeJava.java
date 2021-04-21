package CodingFundamental.Material012;

public class NullableTypeJava {
    public static void main(String[] args) {
        String a = null;
        int b = a.length(); // Error
        if (a != null) {
            System.out.println("Null length "+a.length());
        }
    }
}
