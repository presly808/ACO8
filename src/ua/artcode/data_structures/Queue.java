package ua.artcode.data_structures;

/**
 * Created by serhii on 17.10.15.
 */
public interface Queue<T> extends Iterable<T> {

    void addToTail(T val);

    T takeFromHead();

}
