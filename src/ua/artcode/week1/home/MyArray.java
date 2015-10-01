package ua.artcode.week1.home;

/**
 * Created by serhii on 26.09.15.
 */
public class MyArray {

    private int[] arr;

    public MyArray() {
        arr = new int[16];
    }

    public MyArray(int[] arr) {
        this.arr = arr;
    }

    public void addEl(int element){

    }

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
        for (int i = 0; i < arr.length - 1; i++) {
            res += arr[i] + ",";
        }

        res += arr[arr.length - 1];

        res += "}";

        return res;
    }

    public int[] getArr(){
        return arr;
    }


}
