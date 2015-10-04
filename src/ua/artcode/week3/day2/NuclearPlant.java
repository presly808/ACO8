package ua.artcode.week3.day2;

/**
 * Created by serhii on 10/4/15.
 */
public final class NuclearPlant {

    private final String name;
    private final int criticalTemperature;
    private final int requiredPower;

    /*public NuclearPlant() {
    }*/

    public NuclearPlant(String name, int criticalTemperature, int requiredPower) {
        this.name = name;
        this.criticalTemperature = criticalTemperature;
        this.requiredPower = requiredPower;
    }

    public final boolean start(int currentTemperature, int power){
        if(currentTemperature >= criticalTemperature){
            System.err.println("Can not start");
            return false;
        }

        if(power < requiredPower){
            System.err.println("Not enough power");
            return false;
        }

        System.out.println("Start nuclear plant");
        return true;
    }

    public String getName() {
        return name;
    }

    /*public void setCriticalTemperature(){
        criticalTemperature = 23;
    }*/

    public int getCriticalTemperature() {
        return criticalTemperature;
    }

    public int getRequiredPower() {
        return requiredPower;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NuclearPlant{");
        sb.append("name='").append(name).append('\'');
        sb.append(", criticalTemperature=").append(criticalTemperature);
        sb.append(", requiredPower=").append(requiredPower);
        sb.append('}');
        return sb.toString();
    }
}
