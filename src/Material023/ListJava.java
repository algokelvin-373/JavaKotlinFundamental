package Material023;

import java.util.ArrayList;
import java.util.List;

public class ListJava {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        for(int x = 1; x <= 5; x++) {
            a.add(x);
        }
        System.out.println(a);
        for(int x = 1; x <= 5; x++) {
            System.out.print(x+" ");
        }
    }
}
