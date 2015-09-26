package ua.artcode.week2.day1;

/**
 * Created by serhii on 26.09.15.
 */
public class AirplaneWithCount {

    // lifecycle of static
    private static int count = 0;

    private int speed;
    private String model;

    // init block object -> will be attached before constructors
    {
        count++;
    }

    public AirplaneWithCount() {
    }

    public AirplaneWithCount(String model) {
        // call
        this.model = model;
    }

    public AirplaneWithCount(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public static int getCount(){
        return count;
    }
}
