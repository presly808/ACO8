package ua.artcode.week3.day2;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by serhii on 10/4/15.
 */
public class TestDate {


    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);

        long millis = date.getTime();

        boolean after = date.after(new Date());

        GregorianCalendar calendar = new GregorianCalendar(2006,5,12);

        Date date1 = calendar.getTime();
        calendar.compareTo(new GregorianCalendar(2009,5,12));


    }


}
