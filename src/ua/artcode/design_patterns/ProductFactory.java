package ua.artcode.design_patterns;

/**
 * Created by serhii on 10.10.15.
 */
public class ProductFactory {

    public static Product createProduct(){
        return new ConcreteProduct(12.2,"Milk");
    }


}


