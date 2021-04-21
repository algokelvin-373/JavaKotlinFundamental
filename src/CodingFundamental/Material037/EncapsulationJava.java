package CodingFundamental.Material037;

public class EncapsulationJava {
    public static void main(String[] args) {
        EncapsulJava encapsulJava = new EncapsulJava();
        String msg = encapsulJava.getMsg();
        System.out.println(msg);
    }
}

class EncapsulJava {
    private String msg = "Algokelvin";

    public String getMsg() {
        return msg;
    }
}
