package CodingFundamental.Material034;

public class FunctionWithParamAndReturn {
    public static void main(String[] args) {
        String txt = "You call this function with parameter and return";
        String msg = functionWithParamAndReturn(txt);
        System.out.println(msg);
    }
    public static String functionWithParamAndReturn(String txt) {
        return txt;
    }
}
