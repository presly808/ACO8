package ua.artcode.week3.day1.company;

/**
 * Created by serhii on 10/3/15.
 */
public class Tester extends Employer {

    private String type;

    public Tester() {
    }

    public Tester(String name, int age, double salary, String type) {
        super(name, age, salary);
        this.type = type;
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

    @Override // Metadata - Note for compiler
    public void work() {
        System.out.println("tester works");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
