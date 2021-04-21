package CodingFundamental;

public class ConstructorJava02 {
    public static void main(String[] args) {
        JavaCons02 javaCons0201 = new JavaCons02("Call 1");
        System.out.println(javaCons0201.getTxt01());
        System.out.println(javaCons0201.getTxt02());

        JavaCons02 javaCons0202 = new JavaCons02("Call 10", "Call 20");
        System.out.println(javaCons0202.getTxt01());
        System.out.println(javaCons0202.getTxt02());
    }
}

class JavaCons02 {
    private String txt01, txt02;

    public JavaCons02(String msg01) {
        this.txt01 = msg01;
    }
    public JavaCons02(String msg01, String msg02) {
        this.txt01 = msg01;
        this.txt02 = msg02;
    }
    public String getTxt01() {
        return txt01;
    }
    public String getTxt02() {
        return txt02;
    }
}
