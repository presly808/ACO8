package ua.artcode.week3.day2;

/**
 * Created by serhii on 10/4/15.
 */
public class TestImmutable {

    public static void main(String[] args) {

        String key = "some-key";

        giveKey(key);

        System.out.println(openDoor(key));



    }

    public static void giveKey(String key){
        key.replace("a","a");
    }

    public static boolean openDoor(String key){
        return "some-key".equals(key);
    }

}
