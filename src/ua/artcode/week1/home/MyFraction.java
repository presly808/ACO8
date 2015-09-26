package ua.artcode.week1.home;

/**
 * Created by serhii on 26.09.15.
 */
public class MyFraction {
    private int numerator;
    private int denominator;

    public void set(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public MyFraction add(MyFraction another){
        MyFraction result = new MyFraction();
        result.numerator = this.numerator*another.denominator +
                this.denominator*another.numerator;
        result.denominator = this.denominator*another.denominator;
        return result;
    }

}
