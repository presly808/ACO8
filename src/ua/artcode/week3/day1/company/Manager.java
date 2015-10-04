package ua.artcode.week3.day1.company;

/**
 * Created by serhii on 10/3/15.
 */
public class Manager extends Employer {


    private int employeeCount;

    private Employer[] employers;

    public Manager() {
        employers = new Employer[10];
    }

    public Manager(String name, int age, double salary, int placesCount) {
        super(name, age, salary);
        employers = new Employer[placesCount];
    }

    public void addEmployee(Employer employer){
        employers[employeeCount++] = employer;
    }

    public void doTeamWork(){
        for (int i = 0; i < employeeCount; i++) {
            Employer employer = employers[i];
            employer.work();
        }
    }



}
