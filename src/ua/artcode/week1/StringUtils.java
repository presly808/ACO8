package ua.artcode.week1;

// container for methods
public class StringUtils {

    /*
    * get string from char[]
    * */
    public static String toString(char[] in){
        String str = "";

        for (int i = 0; i < in.length; i++) {
            str = str + in[i];
        }

        return str; // new String(in);
    }

    /**
     *
     * @param ch what will we search
     * @return position in arr of found ch
     * */
    public static int indexOf(char[] src, char ch){
        for (int i = 0; i < src.length; i++) {
            if(src[i] == ch){
                return i;
            }
        }

        return -1;
    }

    public static int count(char[] in, char target){
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if(in[i] == target){
                count++;
            }
        }
        return count;
    }

    public static char[] concat(char[] arr1, char[] arr2){
        char[] res = new char[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i <arr1.length; i++, k++) {
            res[k] = arr1[i];
        }

        for (int i = 0; i <arr2.length; i++, k++) {
            res[k] = arr2[i];
        }

        return res;
    }


}
