package ua.artcode.week5.day2.wrap;

/**
 * Created by serhii on 18.10.15.
 */
public class TestWrappers {


    public static void main(String[] args) {
        Integer i = new Integer(23);

        Double d1 = new Double(23.23);

        Integer i2 = 45;

        int res = 46 + i2;
        int res2 = 46 + i2.intValue();


        pass(res);// autoboxing
    }


    public static void pass(Object obj){
        System.out.println(obj);
    }
}
