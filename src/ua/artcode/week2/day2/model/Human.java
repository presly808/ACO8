package ua.artcode.week2.day2.model;

/**
 * Created by serhii on 27.09.15.
 */
public class Human {

    private String name;
    private int age;
    private String phone;

    private ua.artcode.week2.day2.test.Address address;

    public Human(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public Human(String name, int age, String phone, ua.artcode.week2.day2.test.Address address) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public ua.artcode.week2.day2.test.Address getAddress() {
        return address;
    }

    public void setAddress(ua.artcode.week2.day2.test.Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
