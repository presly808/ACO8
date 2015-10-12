package ua.artcode.home_impl.v1;

public class Plazcart extends Wagon{
    private int price = 100;

    public Plazcart() {
        this.setWagonType("Plazcart");
        for (int i = 0; i < 54; i++) {
            Place temp = new Place(i + 1, price);
            temp.setPlaceType("Lux place");
            places.add(temp);
        }
    }
}
