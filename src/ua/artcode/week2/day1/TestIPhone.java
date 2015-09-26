package ua.artcode.week2.day1;


public class TestIPhone {


    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        IPhone iPhone6s = new IPhone("6s");

        IPhone iPhone5s = new IPhone(50.34);
        IPhone iPhone5 = new IPhone("5", 23, "black",5);

        iPhone.getPontRate();

        IPhone.testStatic();
        iPhone5s.nonStatic();

    }
}
