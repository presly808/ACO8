package ua.artcode.utils.timer;

/**
 * Created by serhii on 10.10.15.
 */
public class TimeCounter {

    public static String countTime(MyAction action){

        long start = System.currentTimeMillis();
        action.doAction();
        long end = System.currentTimeMillis();

        return String.format("action time=%d millis",(end - start));
    }
}
