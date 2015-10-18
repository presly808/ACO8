package ua.artcode.week5.day2.generics;

import java.util.ArrayList;

/**
 * Created by serhii on 18.10.15.
 */
public class _01Intro {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("name1");
        al.add(233);
        al.add(234.23);


        Object val1 = al.get(0);
        String strVal = (String) val1;
        Object val2 = al.get(1);
        int intVal = (Integer) val2;


        // String strVal2 = (String) al.get(2);


        System.out.println("next lines");

        // refernce                 object
        // before 6 java
        ArrayList<String> alG = new ArrayList<String>();
        // since 7 java
        ArrayList<String> alG2 = new ArrayList<>();

        alG2.add("Kolia");
        alG2.add("Vasia");

        String first = alG2.get(0);


    }
}
