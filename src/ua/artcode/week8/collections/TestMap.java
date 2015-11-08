package ua.artcode.week8.collections;

import java.util.*;

/**
 * Created by serhii on 07.11.15.
 */
public class TestMap {


    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();

        map.put(1, "Vasia");
        map.put(2, "Andrey");
        map.put(3, "Ivan");
        map.put(4, "Serhii");

        // replace value
        String old = map.put(4, "Oleg");
        // old = "Serhii"

        System.out.println(map.size());

        System.out.println(map.get(4));

        boolean containsKey = map.containsKey(3);

        boolean containsValue = map.containsValue("Andrey");


        map.isEmpty();

        String removedValue = map.remove(2);

        Collection<String> values = map.values();

        System.out.println(toString(values));

        Iterator<String> iterator = values.iterator();


        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



        // keys
        Set<Integer> keys = map.keySet();

        System.out.println(toString(keys));


        for (Integer key : keys) {
            // key = value
            System.out.printf("%d=%s\n", key, map.get(key));
        }


        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();





    }


    public static String toString(Iterable iterable){
        String res = "";
        for (Object value : iterable) {
            res += value + "\n";
        }
        return res;
    }
}
