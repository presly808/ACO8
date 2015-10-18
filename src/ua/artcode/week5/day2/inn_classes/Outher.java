package ua.artcode.week5.day2.inn_classes;

/**
 * Created by serhii on 18.10.15.
 */
public class Outher {

    private int count;
    private String title;


    // doesn't!!! depend on outer object
    private static class Nested {
        public void test(){
            // count++;
        }
    }

    private class Inner {

    }


}
