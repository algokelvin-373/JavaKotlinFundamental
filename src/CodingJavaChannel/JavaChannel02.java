package CodingJavaChannel;

import java.util.Scanner;

public class JavaChannel02 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        //Input Data Integer
        System.out.print("Input number: ");
        int number = input.nextInt();
        //Input Data String
        System.out.print("Input text: ");
        String text = input.next();

        //Output
        System.out.println("Number: "+number);
        System.out.println("Text: "+text);
    }
}
