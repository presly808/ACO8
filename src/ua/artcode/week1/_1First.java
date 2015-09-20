package ua.artcode.week1;

public class _1First {


    // start point
    public static void main(String[] args) {
        int a = 7;

        String str = "Andriy";
        int[] arr = {56, 34, 23};

        change(a);

        System.out.println(a);

        changeArr(arr, str);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        System.out.println(str);

    }

    public static void change(int a) {
        a = 8;
    }

    public static void changeArr(int[] mas, String word) {
        mas[0] = 89;
        mas = new int[2];
        word = word.substring(1, word.length());
    }


}
