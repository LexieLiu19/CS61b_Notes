package com.cs61b.OOP;

public class LinkedList<Item> implements List61B<Item> {

    private Node dummyHead;
    private int size;

    LinkedList() {
        dummyHead = new Node(-1);
        size = 0;
    }

    LinkedList(Item x) {
        dummyHead.next = new Node<>(x);
        size = 1;
    }

    public void print() {
        if (dummyHead.next == null) {
            System.out.println("This is an empty list");
            return;
        }
        Node temp = dummyHead.next;
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);

    }

    @Override
    public void addFirst(Item x) {
        Node newNode = new Node<>(x);
        newNode.next = dummyHead.next;
        dummyHead.next = newNode;
        size++;
    }

    @Override
    public void addLast(Item y) {
        Node newNode = new Node(y);

        Node temp = dummyHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    @Override
    public Item getFirst() {
        return (Item) dummyHead.next.value;
    }

    @Override
    public Item getLast() {
        if (dummyHead.next == null) return null;
        Node temp = dummyHead.next;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (Item) temp.value;
    }

    @Override
    public Item removeLast() {
        if (dummyHead.next == null) return null;
        Node temp = dummyHead.next;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node removeNode = temp.next;
        
        temp.next = null;
        size--;
        return (Item) removeNode.value;
    }

    @Override
    public Item getAtIndex(int index) {
        if (dummyHead.next == null) return null;
        if (index >= size) return null;
        int counter = 0;
        Node temp = dummyHead.next;
        while (temp.next != null) {
            if (counter == index) {
                return (Item) temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    @Override
    public void insertAt(Item x, int index) {

    }

    @Override
    public int size() {
        return size;
    }
}
