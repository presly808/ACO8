package ua.artcode.week2.day2.model;

/**
 * Created by serhii on 27.09.15.
 */
public class Pound {

    private int freeCell = 0;
    private String name = "Default name";
    private Address address;
    private Dog[] cells = new Dog[10];

    public Pound(String name) {
        this.name = name;
    }

    public Pound(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addDog(Dog dog){
        if(freeCell >= cells.length){
            return false;
        }

        cells[freeCell] = dog;
        freeCell++;
        return true;
    }

    public void showAll(){
        for (int i = 0; i < freeCell; i++) {
            Dog current = cells[i];
            System.out.println(current.asString());
        }
    }

    public Dog takeLastDog(){


        if(freeCell == 0){
            return null;
        }

        freeCell--;
        Dog lucky = cells[freeCell];
        cells[freeCell] = null;

        return lucky;

    }
}
