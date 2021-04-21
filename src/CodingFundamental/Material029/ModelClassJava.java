package CodingFundamental.Material029;

class UserJava {
    int id = 373;
    String name = "Algokelvin";
}

public class ModelClassJava {
    public static void main(String[] args) {
        UserJava user = new UserJava();
        int id = user.id;
        String name = user.name;
        System.out.println("id : "+id);
        System.out.println("name : "+name);
    }
}
