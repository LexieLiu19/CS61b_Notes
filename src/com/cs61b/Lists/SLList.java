package com.cs61b.Lists;

public class SLList {
    private final IntNode sentinel;
    private int size;


    public SLList() {
        sentinel = new IntNode(5, null);//dummy head
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(5, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addFirst(10);
        L.addLast(20);
        System.out.println(L.size);
    }

    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size = size + 1;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        size = size + 1;
        IntNode p = sentinel; // temp pointer to iterate linked list

        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    public int size() {
        return size;
    }
}
