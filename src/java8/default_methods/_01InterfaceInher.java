package java8.default_methods;

/**
 * Created by serhii on 03.11.15.
 */
public class _01InterfaceInher {

    public static void main(String[] args) {
        System.out.println("test");
    }


}

// problem with the same name from parents
/*
class Compositor implements Workable, Employable {


}*/


interface Workable {
    default void work(){
        System.out.println("worker");
    }
}


interface Employable {
    default void work(){
        System.out.println("employee");
    }
}
