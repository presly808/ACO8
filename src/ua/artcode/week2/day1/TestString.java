package ua.artcode.week2.day1;

import ua.artcode.week1.StringUtils;

import java.util.Arrays;

/**
 * Created by serhii on 26.09.15.
 */
public class TestString {

    public static void main(String[] args) {
        // String static

        String res = String.copyValueOf(new char[]{'a','b'});
        String joined = String.join("Some", "New", "Go");
        String intStr = String.valueOf(23);

        String word = "A2345B";
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);

        int unicodePoint = word.codePointAt(0);


        String word2 = new String("A2345B");

        // reference == reference -> eq reference
        // reference.equals(reference) -> eq data
        System.out.printf("word == word2 -> %s\n", word == word2);
        System.out.printf("word.equals(word2) -> %s\n", word.equals(word2));


        word.concat(word2); // word + word2

        System.out.printf("word.compareTo(word2) -> %s\n", word.compareTo(word2));

        boolean has = word.contains("23");

        String lower = "ANDREY".toLowerCase();
        String upper = new String("andrey").toUpperCase();

        // new Integer(23).toString();

        word.startsWith("A2");
        word.endsWith("B");

        int startPosOfTarget = word.indexOf("23");
        int startPosOfTargetFromLast = word.lastIndexOf("5");


        //A2345B                    [1,4)
        String part = word.substring(1, 4);
        // part = 234

        // [1,length)
        String part1 = word.substring(1);

        //
        boolean empty = "".isEmpty();

        int size = word.length();
        // AbcdEA -> abcdEA
        "AbcdEA".replace('A', 'a');

        "AbcdEA".replaceAll("A", "a");

        char[] arr = word.toCharArray();

        String[] parts1 = "String is char arr".split(" ");
        String[] parts2 = "String,is,char,arr".split(",");


        System.out.println(Arrays.toString(parts1));
        System.out.println(Arrays.toString(parts2));









    }
}
