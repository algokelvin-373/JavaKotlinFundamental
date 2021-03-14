package Material017;

import java.util.Scanner;
public class SwitchOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number : ");
        int number = input.nextInt();

        switch (number) {
            case 1 : System.out.println("1. Your input number "+number);
                     break;
            case 2 : System.out.println("2. Your input number "+number);
                     break;
            case 3 : System.out.println("3. Your input number "+number);
                     break;
            default: System.out.println("Your input another number");
        }
    }
}
