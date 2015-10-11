package ua.artcode.recursion.tree.company;


import java.util.ArrayList;

public class Worker {

    String type;
    int earnedMoney;
    Worker[] subordinates;

    public Worker(String type, int earnedMoney, Worker...subordinates) {
        this.type = type;
        this.earnedMoney = earnedMoney;
        this.subordinates = subordinates;
    }



}
