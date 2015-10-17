package ua.artcode.data_structures;


public class NodeUtils {

    public static Node addToHead(Node head){
        return null;
    }

    public static void print(Node head){
        Node iter = head;

        while(iter != null){
            System.out.printf("%s->", iter.value);
            iter = iter.next; // step
        }

        System.out.println();

    }

    public static String printR(Node curr){
        if(curr == null) return "";

        String value = curr.value.toString();
        String next = printR(curr.next);

        return value + next;
    }

    public static String printR1(Node curr){
        if(curr == null) return "";

        return curr.value.toString() + printR1(curr.next);
    }

    public static String printR2(Node curr){
        return curr != null ? (curr.value.toString() + printR1(curr.next)) : "";
    }

    public static String toString(Node head){
        return "";
    }

    public static Node create(Object...mas){
        return null; // return head
    }

    public static void addToTail(Node head, Node newNode){

    }

    public static void addByIndex(Node head, int position, Node newNode){

    }

    public static Node reverse(Node head){
        return null;
    }

    public static Node sort(Node head){
        return null;
    }

}
