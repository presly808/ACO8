package ua.artcode.week6.test_io;

import ua.artcode.utils.io.IOHelper;

import java.io.FileNotFoundException;

/**
 * Created by serhii on 25.10.15.
 */
public class _01Test {


    public static void main(String[] args) throws FileNotFoundException {
        String res = IOHelper.readFrom(
                "/home/serhii/dev/IdeaProjects/ACO8/src/ua/artcode/week1/StringUtils.java");
        System.out.println(res);


        IOHelper.writeTo("file2.txt", "taratarata983492",false);
    }
}
