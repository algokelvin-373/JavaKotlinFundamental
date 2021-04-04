package Material047;

import Material047.packA.ParentClassJava02;

public class ProtectedJava {
    public static void main(String[] args) {
        ChildClassJava02 childClassJava02 = new ChildClassJava02();
//        childClassJava02.msg01; // Can't access because protected in 'packA'
        childClassJava02.setMsg01("This is msg01 in ParentClassJava02 in packA");
        System.out.println(childClassJava02.getMsg01());
        ParentClassJava03 parentClassJava03 = new ParentClassJava03();
        parentClassJava03.msg01 = "This is msg01 in ParentClassJava03 in here";
        System.out.println(parentClassJava03.msg01);
    }
}
class ParentClassJava03 {
    protected String msg01;
}
class ChildClassJava02 extends ParentClassJava02 {
    public void setMsg01(String txt) {
        msg01 = txt;
    }
    public String getMsg01() {
        return msg01;
    }
}
