package CodingFundamental;

public class InheritanceJava {
    public static void main(String[] args) {
        ChildClassJava childClassJava = new ChildClassJava();
        childClassJava.setMethodChild();
        childClassJava.setMethodParent();
    }
}

class ParentClassJava {
    public void setMethodParent() {
        System.out.println("You call parent class");
    }
}

class ChildClassJava extends ParentClassJava {
    public void setMethodChild() {
        System.out.println("You call child class");
    }
}
