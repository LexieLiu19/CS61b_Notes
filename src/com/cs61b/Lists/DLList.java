package com.cs61b.Lists;

public class DLList<T> {
    private int size;
    private Node sentinel; //dummy head


    public class Node {
        public Node prev;
        public T item;
        public Node next;


    }


}
