package ua.artcode.week2.home.univesity;

/**
 * Created by serhii on 01.10.15.
 */
public class Subject {


    private String name;
    private int hoursAmount;
    private int studentHours;
    private int mark;

    public void increment(int hours){
        studentHours += hours;
    }

    public void printInfo(){
        System.out.printf("name %s, amount %d, studentHours %d, mark %d", name,hoursAmount,studentHours,mark);
    }

}
