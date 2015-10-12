package ua.artcode.home_impl.v1;

public class Luxe extends Wagon {
    private int price = 400;


    public Luxe() {
        this.setWagonType("Luxe");
        for (int i = 0; i < 18; i++) {
            Place temp = new Place(i + 1, price);
            temp.setPlaceType("Lux place");
            places.add(temp);
        }


    }
}

