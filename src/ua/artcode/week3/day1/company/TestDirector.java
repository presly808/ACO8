package ua.artcode.week3.day1.company;

/**
 * Created by serhii on 10/4/15.
 */
public class TestDirector {


    public static void main(String[] args) {

        Director director = new Director();

        director.addEmployer(new Coder("Kolia",23,1222));
        director.addEmployer(new Coder("Olia",25,1222));
        director.addEmployer(new Coder("Vania",23,1222));

        System.out.println(director.getAll());
    }
}
