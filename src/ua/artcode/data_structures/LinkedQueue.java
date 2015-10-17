package ua.artcode.data_structures;

import java.util.Iterator;

public class LinkedQueue implements Queue, Iterable {

    private Node head;
    private Node tail;
    private int size;

    @Override
    public void addToTail(Object val) {
        if (size == 0) {
            head = new Node(val, null);
            tail = head;
            size++;
        } else {
            Node newNode = new Node(val, null);
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public Object takeFromHead() {
        if(size == 0){
            return null;
        }

        Object forRet = head.value;
        head = head.next;
        size--;
        return forRet;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
