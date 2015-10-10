package ua.artcode.week4.abst;

public class Vehicle extends Machine{

    public String type;

    public Vehicle(String model, int speed, int weight) {
        super(model, speed, weight);
    }


    @Override
    public void go() {
        System.out.println("Car go method");
    }
}
