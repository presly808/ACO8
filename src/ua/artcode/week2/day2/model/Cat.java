package ua.artcode.week2.day2.model;

/**
 * Created by serhii on 27.09.15.
 */
public class Cat {

    private String name;
    private int age;

    private ua.artcode.week2.day2.test.Address home;

    private ua.artcode.week2.day2.test.Human owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ua.artcode.week2.day2.test.Address getHome() {
        return home;
    }

    public void setHome(ua.artcode.week2.day2.test.Address home) {
        this.home = home;
    }

    public ua.artcode.week2.day2.test.Human getOwner() {
        return owner;
    }

    public void setOwner(ua.artcode.week2.day2.test.Human owner) {
        this.owner = owner;
    }
}
