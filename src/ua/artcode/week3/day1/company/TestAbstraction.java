package ua.artcode.week3.day1.company;

/**
 * Created by serhii on 10/3/15.
 */
public class TestAbstraction {


    public static void main(String[] args) {
        Coder coder1 = new Coder();

        // abstraction -> inheritance
        Employee empl = new Coder();
        empl.work();

        checkInstanceOf(empl);

        // cast = t1 -> t2

        // ClassCastException
        //Tester tester = (Tester) empl;

        // error Coder coder3 = new Employee();
    }

    public static void checkInstanceOf(Employee employee){
        if(employee instanceof Coder){
            Coder coder = (Coder) employee;
            coder.writeCode();
        } else if(employee instanceof Tester){
            Tester tester = (Tester) employee;
            tester.testCode();
        }
    }
}
