package ua.artcode.week5.day2.inn_classes;

/**
 * Created by serhii on 18.10.15.
 */
public class Bank {

    public Bank(){
    }


    public void createCashMachine(){
        CashMachine cm = new CashMachine();

    }

    private static int count;

    public static class CashMachine {
        private int amount;
        private String model;
    }


}
