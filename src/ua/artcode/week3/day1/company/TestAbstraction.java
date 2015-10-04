package ua.artcode.week3.day1.company;

/**
 * Created by serhii on 10/3/15.
 */
public class TestAbstraction {


    public static void main(String[] args) {
        Coder coder1 = new Coder();

        // abstraction -> inheritance
        Employer empl = new Coder();
        empl.work();

        checkInstanceOf(empl);

        // cast = t1 -> t2

        // ClassCastException
        //Tester tester = (Tester) empl;

        // error Coder coder3 = new Employee();
    }

    public static void checkInstanceOf(Employer employer){
        if(employer instanceof Coder){
            Coder coder = (Coder) employer;
            coder.writeCode();
        } else if(employer instanceof Tester){
            Tester tester = (Tester) employer;
            tester.testCode();
        }
    }
}
