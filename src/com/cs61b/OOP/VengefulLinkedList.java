package com.cs61b.OOP;

public class VengefulLinkedList<Item> extends LinkedList<Item> {
    private final LinkedList<Item> deletedItems;

    public VengefulLinkedList() {
        deletedItems = new LinkedList<Item>();
    }

    public static void main(String[] args) {
        VengefulLinkedList vll = new VengefulLinkedList();
        vll.addLast(10);
        vll.addFirst(100);
        vll.addFirst(1000);
        vll.print();
        vll.removeLast();
        vll.printLostItems();
    }

    @Override
    public Item removeLast() {
        Item oldBack = super.removeLast();
        deletedItems.addLast(oldBack);
        return oldBack;
    }

    public void printLostItems() {
        deletedItems.print();
    }
}
