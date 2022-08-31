package com.cs61b.Alist;

public class Alist<Item> {

    private Item[] items;
    private int size;

    public Alist() {
        items = (Item[]) new Object[100]; //cast
        size = 0;
    }

    public static void main(String[] args) {
        Alist al = new Alist();
        al.addFirst(10);
        al.addLast(20);
        al.addLast(30);

        System.out.println(al.getSize());
    }
   /* Invariants:
     getLast: the item we want to return is the position [size-1]
    */

    public void addFirst(Item x) {
        items[0] = x;
        size++;
    }


    /*Invariants:
    addLast: the next item we want to add, will go to the position "size"
    size: the number of items in the list
     */
    public void addLast(Item x) {
        if (size == items.length) {
            resize(size * 2);
        }
        items[size] = x;
        size += 1;
    }

    // resizes the underlying array to the target capacity
    public void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;

    }

    public Item getLast() {
        return items[size - 1];
    }

    public Item get(int idx) {
        return items[idx];
    }

    public int getSize() {
        return size;
    }

    //only need to reduce the size;
    public Item removeLast() {
        Item returnValue = getLast();
        items[size - 1] = null;
        size = size - 1;
        return returnValue;
    }


}
