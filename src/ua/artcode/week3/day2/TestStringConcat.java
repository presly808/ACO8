package ua.artcode.week3.day2;

/**
 * Created by serhii on 10/4/15.
 */
public class TestStringConcat {

    public static void main(String[] args) {


        String text = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            text = text + "*";
        }
        long end = System.currentTimeMillis();
        System.out.printf("time %s\n", end - start);


        StringBuilder sb = new StringBuilder();
        long s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("*");
        }
        long e = System.currentTimeMillis();

        String res = sb.toString();

        System.out.printf("time %s\n", e - s);
    }
}
