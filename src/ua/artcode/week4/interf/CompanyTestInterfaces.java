package ua.artcode.week4.interf;

// use design pattern ->
public class CompanyTestInterfaces {

    public static void main(String[] args) {
        SuperPerson superPerson = new SuperPerson();
        University.testStudent(superPerson);
        Company.testWorker(superPerson);

        Company.testWorker(new Worker());
        Student student = new Student();
        University.testStudent(student);

        Club.letUsDance(student);
    }
}

class University {

    public static void testStudent(StudentBehavior student) {
        student.study();
    }

}

class StudentEx extends Abiturient {

    @Override
    public void study() {

    }
}

class Student implements StudentBehavior, Danceable {

    public void study() {
        System.out.println("Student studying");
    }

    @Override
    public void dance() {
        System.out.println("student dancing");
    }
}

class Company {

    public static void testWorker(WorkerBehavior worker) {
        worker.work();
    }

}

class Worker implements WorkerBehavior {

    public void work() {
        System.out.println("Worker working");
    }

}

class SuperPerson extends Object implements StudentBehavior, WorkerBehavior {

    @Override
    public void study() {
        System.out.println("superperson studying");
    }

    @Override
    public void work() {
        System.out.println("superperson working");
    }
}

// declare behavior
interface StudentBehavior {

    // no constructor
    // no fields, can be public static final (constants)
    // all method public + abstract

    void study();

}

interface WorkerBehavior {

    void work();

}

class Club {

    public static void letUsDance(Danceable danceable){
        danceable.dance();
    }
}

interface Danceable {
    void dance();
}

interface SingerBehavior {
    void sing();
}

interface ArtistBehavior extends Danceable, SingerBehavior {
    // combine interfaces
}

abstract class Abiturient implements Danceable, StudentBehavior{


    @Override
    public void dance() {
        System.out.println("abitura dancing");
    }
}

abstract class  Runner {

    // cross uses abstract methods
    public void cross(int distance){
        sleep();
        eat();
        prepare();
        for (int i = 0; i < distance; i++) {
            doStep();
        }
    }

    protected abstract void eat();

    protected abstract void prepare();

    protected abstract void doStep();

    protected abstract void sleep();


}

class Sprinter extends Runner {

    @Override
    protected void eat() {
        System.out.println("sprinter eat");
    }

    @Override
    protected void prepare() {
        System.out.println("sprinter preparing");
    }

    @Override
    protected void doStep() {
        System.out.println("sprinter doStep");
    }

    @Override
    protected void sleep() {
        System.out.println("sprinter sllep");
    }
}
