package ua.artcode.week3.day1.company;

public class TestCompany {

    public static void main(String[] args) {
        Coder coder = new Coder("Kolia",27,2000);
        Coder coder2 = new Coder("Oleg",23,1300);

        Tester tester = new Tester("Natasha",24,1800,"QA Auto");

        Manager manager = new Manager();

        manager.addEmployee(coder);
        manager.addEmployee(coder2);
        manager.addEmployee(tester);

        manager.doTeamWork();

    }
}
