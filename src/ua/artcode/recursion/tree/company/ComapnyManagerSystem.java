package ua.artcode.recursion.tree.company;

/**
 * Created by serhii on 11.10.15.
 */
public class ComapnyManagerSystem {


    public static int countMoney(Worker worker){

        Worker[] subordinates = worker.subordinates;

        // exit condition
        if(subordinates == null){
            return worker.earnedMoney;
        }

        int amount = worker.earnedMoney;

        for (int i = 0; i < subordinates.length && subordinates[i] != null; i++){
            Worker child = subordinates[i];
            int childMoney = countMoney(child);
            amount += childMoney;
        }

        return amount;
    }

}
