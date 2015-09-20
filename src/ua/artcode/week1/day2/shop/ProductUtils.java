package ua.artcode.week1.day2.shop;

/**
 * Created by serhii on 20.09.15.
 */
public class ProductUtils {

    public static String convertTo(Product product){
        return "id " + product.id + ", name " + product.name + ", price " + product.price;
    }
}
