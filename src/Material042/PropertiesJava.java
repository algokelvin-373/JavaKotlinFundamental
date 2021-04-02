package Material042;

public class PropertiesJava {
    public static void main(String[] args) {
        MethodJava02 methodJava02 = new MethodJava02();
        methodJava02.id = 373;
        methodJava02.name = "Algokelvin";
        System.out.println(methodJava02.id);
        System.out.println(methodJava02.name);
    }
}
class MethodJava02 {
    int id;
    String name;
}