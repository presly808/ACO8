package ua.artcode.data_structures;


public class ArrayQueue implements Queue {

    private static final int DEFAULT_QUEUE_SIZE = 10;

    private Object[] mas;
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public ArrayQueue(){
        mas = new Object[DEFAULT_QUEUE_SIZE];
    }

    public ArrayQueue(int size) {
        mas = new Object[size];
    }

    @Override
    public void addToTail(Object val) {
        if(size >= mas.length){
            System.err.println("queue is full");
        } else {
            mas[tail] = val;
            tail++;
            size++;
        }
    }

    @Override
    public Object takeFromHead() {
        if(size == 0){
            return null;
        }

        Object forRet = mas[head];
        mas[head] = null;
        head++;

        return forRet;
    }
}
