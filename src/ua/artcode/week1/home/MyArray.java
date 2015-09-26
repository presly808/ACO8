package ua.artcode.week1.home;

/**
 * Created by serhii on 26.09.15.
 */
public class MyArray {

    private int[] arr;


    public int countTarget(int findTarget){

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == findTarget){
                count++;
            }
        }

        return count;
    }

    public String asString(){
        String res = "{";
        for (int i = 0; i < arr.length; i++) {

        }

        res += "}";

        return res;
    }


}
