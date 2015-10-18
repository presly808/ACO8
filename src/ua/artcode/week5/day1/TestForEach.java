package ua.artcode.week5.day1;

import ua.artcode.data_structures.ArrayQueue;
import ua.artcode.data_structures.LinkedQueue;
import ua.artcode.data_structures.Queue;

import java.util.ArrayList;


public class TestForEach {


    public static void main(String[] args) {
        int[] mas = {1,2,3,4,5};

        ArrayList al = new ArrayList();
        al.add("name1");
        al.add("name2");
        al.add("name3");
        al.add("name4");


        for(int iter : mas){
            System.out.print(iter + " ");
        }
        System.out.println();

        for(Object iter : al){
            System.out.print(iter + " ");
        }

        System.out.println();


        LinkedQueue queue = new LinkedQueue();
        queue.addToTail(34);
        queue.addToTail(23);
        queue.addToTail(11);
        queue.addToTail("nam3");

        queue.takeFromHead();
        // cast


        // using java for-each ->
        for(Object val: queue){

        }

        //


    }
}
