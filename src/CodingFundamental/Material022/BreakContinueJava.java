package CodingFundamental.Material022;

public class BreakContinueJava {
    public static void main(String[] args) {
        // Break
        for (int x = 1; x <= 10; x++) {
            if (x == 5)
                break;
            System.out.print(x+" ");
        }
        System.out.println();

        // Continue
        for (int x = 1; x <= 10; x++) {
            if (x == 5)
                continue;
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
