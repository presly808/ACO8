package ua.artcode.week2.day2.model;


public class Dog {

    private String name;
    private int age;

    private ua.artcode.week2.day2.test.Human owner;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, ua.artcode.week2.day2.test.Human owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

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

    public ua.artcode.week2.day2.test.Human getOwner() {
        return owner;
    }

    public void setOwner(ua.artcode.week2.day2.test.Human owner) {
        this.owner = owner;
    }
}
