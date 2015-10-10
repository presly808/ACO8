package ua.artcode.week4.abst;

/**
 * Created by serhii on 10.10.15.
 */
public abstract class Machine {

    private final String model;
    private final int speed;
    private final int weight;

    public Machine(String model, int speed, int weight) {
        this.model = model;
        this.speed = speed;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    // depend on concrete child
    public abstract void go();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Machine{");
        sb.append("model='").append(model).append('\'');
        sb.append(", speed=").append(speed);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
