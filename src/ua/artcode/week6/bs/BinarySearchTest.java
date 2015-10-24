package ua.artcode.week6.bs;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by serhii on 24.10.15.
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        int[] mas = {23,33,45,56,67,78,99,100};
        System.out.println(mas.toString());
        System.out.println(Arrays.toString(mas));

        System.out.printf("key %d, index %d\n", 3, binarySearch(mas, 3));
        System.out.printf("key %d, index %d\n", 23, binarySearch(mas,23));
        System.out.printf("key %d, index %d\n", 100, binarySearch(mas,100));
        System.out.printf("key %d, index %d\n", 99, binarySearch(mas,99));
        System.out.printf("key %d, index %d\n", 67, binarySearch(mas, 67));


        String[] names = {"Valia", "John", "Andrey", "Bogdan", "Ivan", "Janna"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println(binarySearch(names, "John"));

        Double[] nums = {1.8,2.4,3.34,4.23,5.4,6.5,7.45};
        // define T via first argument
        System.out.println(binarySearch(names, "sdf", new MyComparator()));
    }

    public static<T> int binarySearch(T[] mas, T key, Comparator<T> comparator){
        int start = 0;
        int end = mas.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(comparator.compare(key, mas[mid]) < 0){
                end = mid - 1;
            } else if(comparator.compare(key, mas[mid]) > 0){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int binarySearch(Object[] mas, Comparable key){
        int start = 0;
        int end = mas.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(key.compareTo(mas[mid]) < 0){
                end = mid - 1;
            } else if(key.compareTo(mas[mid]) > 0){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] mas, int key){
        int start = 0;
        int end = mas.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(key < mas[mid]){
                end = mid - 1;
            } else if(key > mas[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }


}

class MyComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
