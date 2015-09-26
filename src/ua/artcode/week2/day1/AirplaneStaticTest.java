package ua.artcode.week2.day1;

/**
 * Created by serhii on 26.09.15.
 */
public class AirplaneStaticTest {


    public static void main(String[] args) {

        AirplaneWithCount.getCount();


        new AirplaneWithCount();
        new AirplaneWithCount("An-75");
        new AirplaneWithCount("An-60" , 1000);
        new AirplaneWithCount();




        AirplaneWithCount.getCount();

    }
}
