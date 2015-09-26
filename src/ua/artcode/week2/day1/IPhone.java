package ua.artcode.week2.day1;

public class IPhone {

    // static field depends on class
    public static String ceo = "Steve Jobs";

    private String version;
    private double pontRate;
    private String color;
    private double size;

    // 1) clasName = constructorName
    // 2) no declared return type()
    // 3) new  call -> constructor
    // 4) no arg - default
    public IPhone(){
        System.out.println("Default iphone constructor");
    }

    public IPhone(String version, double pontRate, String color, double size) {
        this.version = version;
        this.pontRate = pontRate;
        this.color = color;
        this.size = size;
    }

    // same name - various arg => overloading
    public IPhone(String version){
        this.version = version;
    }

    public IPhone(double pontRate){
        this.pontRate = pontRate;
    }

    // Alt+Ins

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getPontRate() {
        return pontRate;
    }

    public void setPontRate(double pontRate) {
        this.pontRate = pontRate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void nonStatic(){
        testStatic();
        ceo = "new CEO";
    }

    public static void testStatic(){
        // error compile
        // size++;
        // getSize();
        System.out.println(ceo);
    }
}
