package CodingFundamental.Material026;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapJava {
    public static void main(String[] args) {
        Map map=new HashMap();

        //Adding elements to map
        map.put(1,"Java");
        map.put(4,"Kotlin");
        map.put(8,"Swift");
        map.put(9,"Python");

        Set set=map.entrySet(); //Converting to Set so can traverse
        Iterator itr= set.iterator();
        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
