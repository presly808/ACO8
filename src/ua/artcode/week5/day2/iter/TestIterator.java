package ua.artcode.week5.day2.iter;

import ua.artcode.data_structures.ArrayQueue;
import ua.artcode.data_structures.Queue;

import java.util.Iterator;

/**
 * Created by serhii on 18.10.15.
 */
public class TestIterator {


    public static void main(String[] args) {
        Queue<String> queue = new ArrayQueue<>();

        queue.addToTail("12");
        queue.addToTail("12");
        queue.addToTail("12");
       /* queue.addToTail(23);
        queue.addToTail(34);
        queue.addToTail(56);*/

        Iterator<String> iterator = queue.iterator();

        while(iterator.hasNext()){
            String i = iterator.next();

        }

        for (String buff : queue) {
            System.out.println(buff);
        }

    }
}
