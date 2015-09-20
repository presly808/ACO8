package ua.artcode.week1.day2.shop;

/**
 * Created by serhii on 20.09.15.
 */
public class TestProduct {

    // use classes
    public static void main(String[] args) {
        Product product = new Product();
        // create ref    <- create object
        //  2           3       1
        product.id = 12;
        product.name = "Snikers";
        product.price = 20.12;


        System.out.println(ProductUtils.convertTo(product));

        System.out.println(product.asString());

        Product product2 = new Product();


        System.out.println(product2.asString());


    }


}
