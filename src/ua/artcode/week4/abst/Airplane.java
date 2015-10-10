package ua.artcode.week4.abst;

import ua.artcode.week2.day2.model.Human;

public class Airplane extends Machine {

    private String type; // TODO show enums
    private Human pilot;

    public Airplane (){
        super("AN-140",1500,500000);
    }

    public Airplane(String model, int speed, int weight) {
        super(model, speed, weight);
    }

    // implement -> override abstract method
    @Override
    public void go(){
        System.out.println("Airpalane " + toString() + " is flying");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Human getPilot() {
        return pilot;
    }

    public void setPilot(Human pilot) {
        this.pilot = pilot;
    }
}
