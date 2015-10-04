package ua.artcode.week3.day2;

import ua.artcode.week3.day1.company.Coder;

/**
 * Created by serhii on 10/4/15.
 */
public class TestEquals {


    public static void main(String[] args) {

        // problem

        Coder coder1 = new Coder("Ivan", 29,1400);
        Coder coder2 = new Coder("Goga", 35,2200);
        Coder coder3 = new Coder("Ivan", 29,1400);
        Coder coder4 = coder1;




        System.out.printf("coder1 == coder3 %b\n", coder1 == coder3);
        System.out.printf("coder1 == coder2 %b\n", coder1.equals(coder3));



        // reflect - a.equal(a) => true
        // symet - a.equal(b)  = b.equals(a)
        // trans - a.equal(b)  = b.equals(c) => a.equals(c)
        // not null a.equals(null) => false
    }
}
