package ua.artcode.week2.day2.test;

import ua.artcode.week2.day2.model.*;

public class TestAnimals {


    public static void main(String[] args) {
        Address address = new Address("Kiev","Peremogy", 25);

        Human owner = new Human("Oleg",30,"+38093343223",address);

        Dog dog = new Dog("Sharic", 2, owner);
    }
}
