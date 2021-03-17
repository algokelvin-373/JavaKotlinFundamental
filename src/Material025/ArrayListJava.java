package Material025;

import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int x = 1; x <= 5; x++) {
            a.add(x);
        }
        System.out.println(a);
        for(int x = 1; x <= 5; x++) {
            System.out.print(x+" ");
        }
    }
}
