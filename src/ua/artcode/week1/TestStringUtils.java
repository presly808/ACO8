package ua.artcode.week1;

import ua.artcode.week1.day2.shop.Seller;

/**
 * Created by serhii on 20.09.15.
 */
public class TestStringUtils {


    public static void main(String[] args) {
        Seller seller = new Seller();
        char[] in = {'a', 'b', 'c'};
        String str = StringUtils.toString(in);
        int count = StringUtils.count(in,'c');
    }
}
