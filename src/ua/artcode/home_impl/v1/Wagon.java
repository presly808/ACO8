package ua.artcode.home_impl.v1;
import java.util.*;

public class Wagon {

    private String wagonType;
    int price;
    ArrayList<Place> places = new ArrayList<Place>();

    public String getWagonType() {
        return wagonType;
    }

    public void setWagonType(String wagonType) {
        this.wagonType = wagonType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
