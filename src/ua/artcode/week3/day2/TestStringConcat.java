package ua.artcode.week3.day2;

import ua.artcode.utils.timer.MyAction;
import ua.artcode.utils.timer.TimeCounter;

import java.util.Arrays;

/**
 * Created by serhii on 10/4/15.
 */
public class TestStringConcat {

    public static void main(String[] args) {


        /*String text = "";
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

        System.out.printf("time %s\n", e - s);*/


        String res1 = TimeCounter.countTime(new StringBuilderAction(10000));
        String res2 = TimeCounter.countTime(new StringConcatAction(10000));

        System.out.println(res1);
        System.out.println(res2);
    }
}

class StringConcatAction implements MyAction {

    private int count;

    public StringConcatAction(int count) {
        this.count = count;
    }

    @Override
    public void doAction() {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + "*";
        }
    }
}


class StringBuilderAction implements MyAction {

    private int count;

    public StringBuilderAction(int count) {
        this.count = count;
    }

    @Override
    public void doAction() {
        StringBuilder sb = new StringBuilder();
        count = 100000;
        for (int i = 0; i < count; i++) {
            sb.append("*");
        }
    }
}
