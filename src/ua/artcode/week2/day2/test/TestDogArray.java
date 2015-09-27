package ua.artcode.week2.day2.test;

/**
 * Created by serhii on 27.09.15.
 */
public class TestDogArray {

    public static void main(String[] args) {

        Pet pet1 = new Pet("Killer", 5);
        Pet pet2 = new Pet("Cucyc", 2);
        Pet pet3 = new Pet("Murchik", 1);

        Pet remote = pet1;

        Pet[] pets = new Pet[5]; // r r r r r

        pets[0] = pet1;
        pets[1] = pet2;
        pets[2] = pet3;

        pet1 = null;
        pet2 = null;
        pet3 = null;


        remote = pets[2];
    }


}

class Pet {

    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
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
}

