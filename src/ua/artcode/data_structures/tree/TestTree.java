package ua.artcode.data_structures.tree;

import java.util.Comparator;
import java.util.Map;

/**
 * Created by serhii on 08.11.15.
 */
public class TestTree {


    public static void main(String[] args) {
        Comparator<Integer> comparator1 = (Integer x, Integer y) -> {return x - y;};
        Comparator<Integer> comparator2 = (x, y) -> x - y;
        Comparator<Integer> comparator3 = Integer::compare;

        Map<Integer, String> map = new BinarySearchTreeMap<>(comparator3);

        map.put(10,"Vasia");
        map.put(4,"Kolia");
        map.put(16,"Andrey");
        map.put(2,"Ivan");
        map.put(20, "Oleg");

        System.out.println(map.toString());


    }
}
