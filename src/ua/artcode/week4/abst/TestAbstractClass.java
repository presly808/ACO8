package ua.artcode.week4.abst;

/**
 * Created by serhii on 10.10.15.
 */
public class TestAbstractClass {


    public static void main(String[] args) {
        // parent ref = child object
        // Abstraction
        Machine machine = new Vehicle("toyota",250,2000);
        // machine = new Airplane();
        GarageUtils.doGoTest(machine);
    }
}
