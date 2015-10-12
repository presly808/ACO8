package ua.artcode.home_impl.v1;


public class Place {
    private int placeNumber;
    private int placePrice;
    private String placeType;

    public Place(int placeNumber, int placePrice) {
        this.placeNumber = placeNumber;
        this.placePrice = placePrice;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public int getPlacePrice() {
        return placePrice;
    }

    public void setPlacePrice(int placePrice) {
        this.placePrice = placePrice;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }
}
