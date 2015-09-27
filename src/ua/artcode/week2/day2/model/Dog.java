package ua.artcode.week2.day2.model;


public class Dog {

    private String name;
    private int age;

    private Human owner;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, Human owner) {
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

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
    
    public String asString(){
        return String.format("name %s, age %d", name,age);
    }

    public String asStringWithOwner(){
        return String.format("name %s, age %d, owner %s", name, age, owner.asString());
    }
}
