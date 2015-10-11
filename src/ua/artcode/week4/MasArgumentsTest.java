package ua.artcode.week4;

/**
 * Created by serhii on 11.10.15.
 */
public class MasArgumentsTest {


    public static void main(String[] args) {
        count();
        count(1);
        count(1,2,3,4,5,6);
        int[] mas = {2,3,6};
        count(mas);

        countB(new byte[]{1,2,3,4});

    }

    public static void count(int...nums){
        int[] arr = nums;
    }

    public static void countB(byte[] mas){

    }
}
