package Material039;

interface MsgLambda {
    String showMsg(String str);
}
public class LambdaJava {
    public static void main(String[] args) {
        MsgLambda msg = (txt) -> txt + "373";
        showMsgLambda("Algokelvin", msg);
    }
    public static void showMsgLambda(String txt, MsgLambda msgLambda) {
        System.out.println(msgLambda.showMsg(txt));
    }
}
