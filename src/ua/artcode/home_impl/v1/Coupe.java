package ua.artcode.home_impl.v1;

public class Coupe extends Wagon{
    public static final int PLACE_COUNT = 36;
    private int price = 200;

    public Coupe() {
        this.setWagonType("Coupe");
        for (int i = 0; i < PLACE_COUNT; i++) {
            Place temp = new Place(i + 1, price);
            temp.setPlaceType("Coupe place");
            places.add(temp);
        }
    }
}
