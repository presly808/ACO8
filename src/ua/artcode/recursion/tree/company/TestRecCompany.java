package ua.artcode.recursion.tree.company;

/**
 * Created by serhii on 11.10.15.
 */
public class TestRecCompany {

    public static void main(String[] args) {
        Worker worker1 = new Worker("worker", 1000, null);
        Worker worker2 = new Worker("worker", 1000, null);

        Worker worker3 = new Worker("worker", 1000, null);
        Worker worker4 = new Worker("worker", 1000, null);

        Worker worker5 = new Worker("worker", 1000, null);
        Worker worker6 = new Worker("worker", 1000, null);


        Worker manager1 = new Worker("manager", 5000, worker1,worker2);
        Worker manager2 = new Worker("manager", 5000, worker3,worker4);
        Worker manager3 = new Worker("manager", 5000, worker5,worker6);


        Worker director = new Worker("director",20000,manager1,manager2,manager3);


        int amount = ComapnyManagerSystem.countMoney(director);

        System.out.println(amount);
    }
}
