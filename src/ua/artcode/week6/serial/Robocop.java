package ua.artcode.week6.serial;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Robocop implements Serializable {

    private String model;
    private int health;
    private int power;
    private double price;
    // transient field will not serialized
    private transient List<String> al = Arrays.asList("pass1", "pass2");

    public Robocop() {
    }

    public Robocop(String model, int health,
                   int power, double price) {
        this.model = model;
        this.health = health;
        this.power = power;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Robocop{");
        sb.append("model='").append(model).append('\'');
        sb.append(", health=").append(health);
        sb.append(", power=").append(power);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
