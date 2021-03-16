package Material020;

public class LoopingDoWhileJava {
    public static void main(String[] args) {
        //Show: 1 2 3 ... 10
        int x = 1;
        do {
            System.out.print(x+" ");
            x++;
        } while(x <= 10);
        System.out.println();
    }
}
