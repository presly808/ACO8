package ua.artcode.week5.day1;

import ua.artcode.data_structures.Node;

/**
 * Created by serhii on 17.10.15.
 */
public class TestNode {

    public static void main(String[] args) {
        Node node1 = new Node(1, null);

        Node node2 = new Node(2,null);

        node1.next = node2;
        Node node3 = new Node(3, node1);

        // 3->1->2

        Node chain = new Node(5,new Node(4,new Node(3, new Node(2,null))));
        // 5-4-3-2-null
        // how to get last element

        // head   -    tail





    }
}
