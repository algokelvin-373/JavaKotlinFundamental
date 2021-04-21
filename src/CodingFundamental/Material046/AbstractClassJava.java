package CodingFundamental.Material046;

abstract class JavaAbstract {
    public abstract void methodAbstract();
    public void abstractWithToDo() {
        System.out.println("You call in JavaAbstract");
    }
}

class SampleClassJava extends JavaAbstract {
    @Override
    public void methodAbstract() {
        System.out.println("You call outside JavaAbstract");
    }
}

public class AbstractClassJava {
    public static void main(String[] args) {
        SampleClassJava sampleClassJava = new SampleClassJava();
        sampleClassJava.methodAbstract();
        sampleClassJava.abstractWithToDo();
    }
}
