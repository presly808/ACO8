package ua.artcode.week1.home;

/**
 * Created by serhii on 01.10.15.
 */
public class TestMyArr {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,7};
        MyArray array  = new MyArray(arr);
        System.out.println(array.asString());

        System.out.println(new MyArray().asString());

        int[] mArr = array.getArr();

    }
}
