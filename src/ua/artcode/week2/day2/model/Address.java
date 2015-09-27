package ua.artcode.week2.day2.model;

/**
 * Created by serhii on 27.09.15.
 */
public class Address {

    private String city;
    private String street;
    private int houseNum;

    public Address(String city, String street, int houseNum) {
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }
}
