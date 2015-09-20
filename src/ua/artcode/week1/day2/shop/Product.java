package ua.artcode.week1.day2.shop;

// creator , write template, library
public class Product {

    int id;
    String name;
    double price;

    public String asString(){
        return "id " + id + ", name " + name + ", price " + price;
    }

    public void initData(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
