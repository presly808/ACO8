package ua.artcode.week3.day1.company;

/**
 * Created by serhii on 10/3/15.
 */
public class Tester extends Employee {

    private String type;

    public Tester() {
    }

    public Tester(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void testCode(){
        System.out.println("tester tests");
    }
}
