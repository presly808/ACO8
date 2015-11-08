package java8.functions;

import java.util.Arrays;

public class _01OwnHightOrderFunction {
    public static void main(String[] args) {
        Impl.pass(Arrays::asList);
    }
}

// must be a functional interface
@FunctionalInterface
interface MyAction<T,X,Z> {
    X combine(T t, Z z);
}

class Impl {

    static void pass(MyAction myAction){
    }
}
