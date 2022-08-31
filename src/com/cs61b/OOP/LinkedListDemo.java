package com.cs61b.OOP;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
        l.print();
        System.out.println("Size = " + l.size());


    }
}
