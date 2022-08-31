package com.cs61b.Project1;

public class LinkedListDeque<T> {

    private int size;
    private Node dummyHead;

    public LinkedListDeque() {
        dummyHead = null;
        size = 0;
    }

    public LinkedListDeque(T i) {
        dummyHead.next = new Node(i);
        size = 1;
    }

    public void addFirst(T item) {
        dummyHead.next = new Node(item);
        size = size + 1;
    }

    public void addLast(T item) {
        dummyHead.prev = new Node(item);
    }


    public class Node {
        public T item;
        public Node next;
        public Node prev;

        public Node(T i) {
            item = i;
            next = null;
            prev = null;
        }
    }
}
