package ua.artcode.week5.day1;

import ua.artcode.data_structures.ArrayQueue;
import ua.artcode.data_structures.Queue;

/**
 * Created by serhii on 18.10.15.
 */
public class TestArrayQueue {


    public static void main(String[] args) {
        Queue<Double> arrayQueue = new ArrayQueue<>();
        arrayQueue.addToTail((double)23);
        arrayQueue.addToTail(45.3);

    }
}
