package ua.artcode.week3.day2;

/**
 * Created by serhii on 10/4/15.
 */
public class TestPlant {

    public static void main(String[] args) {
        NuclearPlant nuclearPlant = new NuclearPlant("Chern", 500, 1000);

//        nuclearPlant = new FakeStation();


        nuclearPlant.start(7000, 10000);


    }
}
