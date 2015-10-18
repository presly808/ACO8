package ua.artcode.week5.day2.generics;

public class TestContainer {
    public static void main(String[] args) {

        // 1. Type save
        // 2. Flexibility
        // 3. RuntimeException -> Compile error
        Container<Integer> container = new Container<>(34);
        container.getVal();
    }

}
