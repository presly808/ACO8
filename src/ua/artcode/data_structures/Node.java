package ua.artcode.data_structures;

/**
 * Created by serhii on 17.10.15.
 */
public class Node {

    public Object value;
    public Node next;

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }
}
