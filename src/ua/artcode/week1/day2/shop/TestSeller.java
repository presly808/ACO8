package ua.artcode.week1.day2.shop;

/**
 * Created by serhii on 20.09.15.
 */
public class TestSeller {


    public static void main(String[] args) {
        Seller seller1 = new Seller();
        seller1.initData(1, "Olga Ivanivna", 27, 1000);

        seller1.showInfo();

        Seller seller2 = new Seller();
        seller2.initData(2, "Eva", 22, 1000);
        seller2.showInfo();

        seller2.

        Seller[] sellers = new Seller[10];

        sellers[0] = seller1;


    }
}
