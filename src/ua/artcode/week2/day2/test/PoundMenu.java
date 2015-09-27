package ua.artcode.week2.day2.test;

import ua.artcode.week2.day2.model.*;
import ua.artcode.week2.day2.model.Address;
import ua.artcode.week2.day2.model.Dog;

import java.util.Scanner;

/**
 * Created by serhii on 27.09.15.
 */
public class PoundMenu {

    private Pound pound;

    public PoundMenu() {
        initPoundData();
    }

    private void initPoundData() {
        pound = new Pound("DogHeaven", new Address("Kiev","Ivanova",23));
        pound.addDog(new Dog("Sharic",5));
        pound.addDog(new Dog("Barsik",3));
        pound.addDog(new Dog("Jack",2));
        pound.addDog(new Dog("Britta",8));
        pound.addDog(new Dog("Bobic",9));
        pound.addDog(new Dog("Rex", 4));
    }

    public void startMenu(){
        Scanner sc = new Scanner(System.in);

        int choice = -1;
        while(choice != 4){
            showMenu();
            choice = sc.nextInt();

            if(choice == 1){
                addDogMenu(sc);
            } else if(choice == 2){
                showAllMenu();
            } else if(choice == 3){
                takeLastDogMenu();
            }
            
        }
    }

    public void showMenu(){
        System.out.println("1.Add dog");
        System.out.println("2.Show dogs");
        System.out.println("3.Take last dog");
        System.out.println("4.Exit");
    }

    public void addDogMenu(Scanner sc){
        System.out.println("Input dog name");
        String dogName = sc.next();
        System.out.println("Input dog age");
        int dogAge = sc.nextInt();

        Dog newDog = new Dog(dogName,dogAge);

        pound.addDog(newDog);
    }

    public void showAllMenu(){
        pound.showAll();
    }

    public void takeLastDogMenu() {
        Dog lucky = pound.takeLastDog();
        System.out.println("Your pet is " + lucky.asString());
    }

}
