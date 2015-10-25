package ua.artcode.utils.io;

/**
 * Created by serhii on 25.10.15.
 */
public interface MySerializator<T> {


    String format(T t);

    T parse(String strObject);

}
