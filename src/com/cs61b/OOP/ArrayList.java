package com.cs61b.OOP;

public class ArrayList<Item> implements List61B<Item> {

    private int size;
    private final Item[] items = (Item[]) new Object[100];

    public static void resize(int size) {
        size = size * 2;
    }

    @Override
    public void addFirst(Item x) {
        items[0] = x;
        size++;
    }

    @Override
    public void addLast(Item y) {
    }

    @Override
    public Item getFirst() {
        return items[0];
    }

    @Override
    public Item getLast() {
        return items[size - 1];
    }

    @Override
    public Item removeLast() {

        items[size - 1] = null;
        size--;
        return items[size];
    }

    @Override
    public Item getAtIndex(int index) {
        return items[index];
    }

    @Override
    public void insertAt(Item x, int index) {
        items[index] = x;
    }

    @Override
    public int size() {
        return size;
    }
}
