package Material002;

import java.util.Scanner;

public class InputOutputJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your name : ");
        String name = input.nextLine(); // Input Data
        System.out.println("Your name is "+name); // Output Data
    }
}
