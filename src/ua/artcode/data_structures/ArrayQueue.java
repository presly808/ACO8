package ua.artcode.data_structures;


import java.util.Iterator;

public class ArrayQueue<E> implements Queue<E> {

    private static final int DEFAULT_QUEUE_SIZE = 10;

    private E[] mas;
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public ArrayQueue(){
        this(DEFAULT_QUEUE_SIZE);
    }

    public ArrayQueue(int size) {
        mas = (E[]) new Object[size];
    }


    public void addToTail(E val) {
        if(size >= mas.length){
            System.err.println("queue is full");
        } else {
            mas[tail] = val;
            tail++;
            size++;
        }
    }


    public E takeFromHead() {
        if(size == 0){
            return null;
        }

        E forRet = mas[head];
        mas[head] = null;
        head++;

        return forRet;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayQueueIterator();
    }

    // inner object depends on outer object
    private class ArrayQueueIterator implements Iterator<E> { // inner class

        private int curr = head;

        @Override
        public boolean hasNext() {
            return curr < tail;
        }

        @Override
        public E next() {
            E forRet = mas[curr];
            curr++;
            return forRet;
        }
    }
}
